package com.mrmrmr7.mytunes.controller.command.impl.view;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.Album;
import com.mrmrmr7.mytunes.entity.Author;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.AlbumService;
import com.mrmrmr7.mytunes.service.AuthorService;
import com.mrmrmr7.mytunes.service.GenreService;
import com.mrmrmr7.mytunes.service.exception.ServiceException;
import com.mrmrmr7.mytunes.service.impl.AlbumServiceImpl;
import com.mrmrmr7.mytunes.service.impl.AuthorServiceImpl;
import com.mrmrmr7.mytunes.service.impl.GenreServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ViewAdminCreateAlbumPage implements Command {
    @Override
    public ResponseContent process(HttpServletRequest request) {
        System.out.println(CommandDirector.ADMIN_VIEW_ADD_ALBUM_PAGE.getValue() + " command detected");
        ResponseContent responseContent = new ResponseContent();
        AuthorService authorService = new AuthorServiceImpl();
        GenreService genreService = new GenreServiceImpl();

        try {
            List<Author> authorList = authorService.getAuthorList();

            request.setAttribute("genreList", genreService.getGenreList());
            request.setAttribute("authorList", authorList);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        responseContent.setRouter(new Router(PageDirector.VIEW_ADMIN_CREATE_ALBUM_PAGE, Router.Type.FORWARD));
        return responseContent;
    }
}