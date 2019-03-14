package com.mrmrmr7.mytunes.controller.command.impl.author;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.dao.impl.ConnectionPoolFactory;
import com.mrmrmr7.mytunes.dao.ConnectionPoolType;
import com.mrmrmr7.mytunes.dao.exception.DaoException;
import com.mrmrmr7.mytunes.dao.impl.AuthorDao;
import com.mrmrmr7.mytunes.entity.Author;
import com.mrmrmr7.mytunes.util.BeanDirector;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;

public class CommandAuthorGetById implements Command {

    private static final String PARAMETER_VIEW_NAME = "viewName";
    private static final String INCLUDE_PATH = "author/getbyid";
    private static final String PARAMETER_ID = "id";

    @Override
    public ResponseContent process(HttpServletRequest request) {
        System.out.println(CommandDirector.AUTHOR_GET_BY_ID.getValue() + " command detected");
        AuthorDao authorDAO = new AuthorDao();
        Author author = null;
        try {
            authorDAO.setConnection(ConnectionPoolFactory
                    .getInstance()
                    .getConnectionPool(ConnectionPoolType.MYSQL)
                    .getConnection());

            author = authorDAO
                    .getByPK(Integer.valueOf(request.getParameter(PARAMETER_ID)))
                    .get();
        } catch (DaoException e) {
            System.out.println("Impossible to find author with such id");
        } finally {
            authorDAO.closeConnection();
        }

        request.setAttribute(BeanDirector.AUTHOR.getValue(), author);
        request.setAttribute(PARAMETER_VIEW_NAME, INCLUDE_PATH);
        ResponseContent responseContent = new ResponseContent();
        responseContent.setRouter(new Router(PageDirector.VIEW, Router.Type.FORWARD));
        return responseContent;
    }
}