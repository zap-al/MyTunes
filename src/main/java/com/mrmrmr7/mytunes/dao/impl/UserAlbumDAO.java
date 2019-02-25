package com.mrmrmr7.mytunes.dao.impl;

import com.mrmrmr7.mytunes.dao.AbstractJDBCDAO;
import com.mrmrmr7.mytunes.dao.TableName;
import com.mrmrmr7.mytunes.entity.UserAlbum;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserAlbumDAO extends AbstractJDBCDAO<UserAlbum, Integer> {

    public UserAlbumDAO() {
    }

    @Override
    public Optional<UserAlbum> getByPK(Integer id) throws SQLException {
        try (PreparedStatement preparedStatement = prepareStatementForGet(id);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();
            return Optional.of(resultSetCompiller.setUserAlbum(resultSet));
        }
    }

    @Override
    public List<UserAlbum> getAll() throws SQLException {

        List<UserAlbum> userList = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepareStatementForGetAll(TableName.USER_ALBUM)){
            try (ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()) {
                    userList
                            .add(resultSetCompiller.setUserAlbum(resultSet));
                }
            }
        }

        return userList;
    }

    @Override
    public void insert(UserAlbum object) throws SQLException {
        try (PreparedStatement preparedStatement = prepareStatementForInsert(object)) {
            preparedStatement.executeBatch();
        }
    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (PreparedStatement preparedStatement = prepareStatementForDelete(id)){
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void update(UserAlbum object) throws SQLException {
        try (PreparedStatement preparedStatement = prepareStatementForUpdate(object)){
            preparedStatement.executeBatch();
        }
    }

    @Override
    protected PreparedStatement prepareStatementForInsert(UserAlbum object) throws SQLException {

        List<Integer> userAlbumIdList = object.getAlbumIdList();
        PreparedStatement preparedStatement = connection.prepareStatement(getInsertQuery());

        for (int i = 0; i < userAlbumIdList.size(); i++) {
            int j = 0;
            preparedStatement.setInt(++j, object.getId().intValue());
            preparedStatement.setInt(++j, object.getAlbumId(i));
            preparedStatement.addBatch();
        }

        return preparedStatement;
    }

    @Override
    protected PreparedStatement prepareStatementForUpdate(UserAlbum object) throws SQLException {

        List<Integer> userAlbumIdList = object.getAlbumIdList();
        PreparedStatement preparedStatement = connection.prepareStatement(getUpdateQuery());

        for (int i = 0; i < userAlbumIdList.size(); i++) {
            int j = 0;
            preparedStatement.setInt(++j, object.getId());
            preparedStatement.setInt(++j, object.getAlbumId(i));
            preparedStatement.setInt(++j, object.getCortageId(i));
            preparedStatement.addBatch();
        }

        return preparedStatement;
    }

    @Override
    protected PreparedStatement prepareStatementForDelete(Integer id) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(getDeleteQuery(TableName.USER_ALBUM));
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    @Override
    protected PreparedStatement prepareStatementForGet(Integer id) throws SQLException {

        PreparedStatement preparedStatement = connection
                .prepareStatement(getSelectQuery(TableName.USER_ALBUM), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    @Override
    protected String getSelectQuery(TableName tableName) {

        return "SELECT * FROM " + tableName.getValue() + " WHERE USER_ID=?";
    }

    @Override
    protected String getDeleteQuery(TableName tableName) {
        return "DELETE FROM " + tableName.getValue() + " WHERE USER_ID=?";
    }


    @Override
    public String getInsertQuery() {

        return "INSERT INTO " + TableName.USER_ALBUM.getValue() +
                "(USER_ID, ALBUM_ID) " +
                "VALUES " +
                "(?,?)";
    }

    @Override
    public String getUpdateQuery() {

        return "UPDATE " + TableName.USER_ALBUM.getValue() + " SET " +
                "USER_ID=?, ALBUM_ID=? " +
                "WHERE ID=?";

    }
}