package com.mrmrmr7.mytunes.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.mrmrmr7.mytunes.dao.GenericDao;
import com.mrmrmr7.mytunes.dao.TransactionManager;
import com.mrmrmr7.mytunes.dao.UserDaoExtended;
import com.mrmrmr7.mytunes.dao.exception.DaoException;
import com.mrmrmr7.mytunes.dao.impl.JdbcDaoFactory;
import com.mrmrmr7.mytunes.dao.impl.TransactionManagerImpl;
import com.mrmrmr7.mytunes.dto.*;
import com.mrmrmr7.mytunes.entity.*;
import com.mrmrmr7.mytunes.service.exception.ServiceException;
import com.mrmrmr7.mytunes.service.UserDtoService;
import com.mrmrmr7.mytunes.util.ProtectionUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserDtoServiceImpl implements UserDtoService {
    @Override
    public UserDto getDtoById(int id) throws ServiceException {
        TransactionManager transactionManager = new TransactionManagerImpl();

        JdbcDaoFactory daoFactory = JdbcDaoFactory.getInstance();

        try {
            GenericDao userDao = daoFactory.getTransactionalDao(User.class);
            GenericDao userBonusDao = daoFactory.getTransactionalDao(UserBonus.class);
            GenericDao userAlbumDao = daoFactory.getTransactionalDao(UserAlbum.class);
            GenericDao userCompositionDao = daoFactory.getTransactionalDao(UserComposition.class);
            GenericDao userMusicSelectionDao = daoFactory.getTransactionalDao(UserMusicSelection.class);
            GenericDao statusDao = daoFactory.getTransactionalDao(Status.class);
            GenericDao roleDao = daoFactory.getTransactionalDao(Role.class);
            GenericDao bonusDao = daoFactory.getTransactionalDao(Bonus.class);
            GenericDao compositionDao = daoFactory.getTransactionalDao(Composition.class);
            GenericDao musicSelectionDao = daoFactory.getTransactionalDao(MusicSelection.class);
            GenericDao albumDao = daoFactory.getTransactionalDao(Album.class);

            transactionManager.begin(userDao,
                    userAlbumDao,
                    userCompositionDao,
                    userMusicSelectionDao,
                    statusDao,
                    roleDao,
                    compositionDao,
                    musicSelectionDao,
                    albumDao,
                    userBonusDao,
                    bonusDao);

            UserDto userDto;

            Optional<User> userOptional = userDao.getByPK(id);

            if (!userOptional.isPresent()) {
                throw new ServiceException("lol");
            }

            User user = userOptional.get();
            userDto = new UserDto();
            userDto.setLogin(user.getLogin());
            userDto.setFirst_name(user.getFirstName());
            userDto.setSecond_name(user.getSecondName());
            userDto.setBalance(user.getBalance());
            userDto.setEmail(user.getEmail());

            Optional<Status> statusOptional = statusDao.getByPK(user.getStatusId());

            if (!statusOptional.isPresent()) {
                throw new ServiceException("kek");
            }

            Status status = statusOptional.get();
            userDto.setStatus(status);

            Optional<Role> roleOptional = roleDao.getByPK(user.getRoleId());

            if (!roleOptional.isPresent()) {
                throw new ServiceException("omg");
            }

            Role role = roleOptional.get();

            userDto.setRole(role);

            Optional<UserComposition> userCompositionOptional = userCompositionDao.getByPK(user.getId());

            userCompositionOptional.ifPresent(u -> {
                List<Integer> userCompositionIdList = u.getCompositionIdList();
                userCompositionIdList.forEach(s -> {
                    try {
                        Optional<Composition> compositionOptional = compositionDao.getByPK(s);
                        compositionOptional.ifPresent(userDto::addComposition);
                    } catch (DaoException e) {
                        e.printStackTrace();
                    }
                });
            });

            Optional<UserAlbum> userAlbumOptional = userAlbumDao.getByPK(user.getId());

            userAlbumOptional.ifPresent(u -> {
                List<Integer> userAlbumList = u.getAlbumIdList();
                userAlbumList.forEach(t -> {
                    try {
                        Optional<Album> albumOptional = albumDao.getByPK(t);
                        albumOptional.ifPresent(userDto::addAlbum);
                    } catch (DaoException e) {
                        e.setStackTrace(e.getStackTrace());
                    }
                });
            });

            Optional<UserBonus> userBonusOptional = userBonusDao.getByPK(user.getId());
            userBonusOptional.ifPresent(u -> {
                List<Integer> bonusIdList = u.getBonusIdList();
                bonusIdList.forEach(t -> {
                    try {
                        Optional<Bonus> bonusOptional = bonusDao.getByPK(t);
                        bonusOptional.ifPresent(userDto::addBonus);
                    } catch (DaoException e) {
                        e.setStackTrace(e.getStackTrace());
                    }
                });
            });

            Optional<UserMusicSelection> userMusicSelectionOptional = userMusicSelectionDao.getByPK(user.getId());

            userMusicSelectionOptional.ifPresent(u -> {
                List<Integer> musicSelectionList = u.getMusicSelectionIdList();
                musicSelectionList.forEach(t -> {
                    try {
                        Optional<MusicSelection> musicSelectionOptional = musicSelectionDao.getByPK(t);
                        musicSelectionOptional.ifPresent(userDto::addMusicSelection);
                    } catch (DaoException e) {
                        e.setStackTrace(e.getStackTrace());
                    }
                });
            });
            return userDto;
        } catch (DaoException e) {
            throw new ServiceException(e.getMessage());
        } finally {
            try {
                transactionManager.commit();
            } catch (DaoException e) {
                throw new ServiceException(e.getMessage());
            }
            try {
                transactionManager.end();
            } catch (DaoException e) {
                throw new ServiceException(e.getMessage());
            }
        }
    }

    @Override
    public UserDto getDtoByLogin(String login) throws ServiceException {
        Optional<User> userOptional = null;
        try {
            userOptional = ((UserDaoExtended) JdbcDaoFactory.getInstance().getDao(User.class)).getByLogin(login);
        } catch (DaoException e) {
            e.printStackTrace();
        }


        return getDtoById(userOptional.get().getId());
    }

    public void setDtoFromToken(HttpServletRequest httpServletRequest) throws ServiceException {
        Cookie[] cookies = httpServletRequest.getCookies();
        Optional<Cookie> cookieToken;
        Optional<Cookie> cookiePublicKey;

        cookieToken = Arrays.stream(cookies).filter(s -> s.getName().equals("token")).findFirst();

        if (!cookieToken.isPresent()) {
            throw new ServiceException("no token");
        }

        cookiePublicKey = Arrays.stream(cookies).filter(s -> s.getName().equals("publicKey")).findFirst();

        if(!cookiePublicKey.isPresent()) {
            throw new ServiceException("no public key");
        }

        RSAPublicKey publicKey = (RSAPublicKey)ProtectionUtil.stringToPublicKey(cookiePublicKey.get().getValue());

        DecodedJWT decodedJWT = JWT.decode(cookieToken.get().getValue());

        UserDto userDto = new UserDto();

        userDto = getDtoById(decodedJWT.getClaim("userId").asInt());


        httpServletRequest.setAttribute("userDto", userDto);
    }

}
