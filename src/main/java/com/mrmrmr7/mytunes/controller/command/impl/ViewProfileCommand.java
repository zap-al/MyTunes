package com.mrmrmr7.mytunes.controller.command.impl;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.ServiceException;
import com.mrmrmr7.mytunes.service.impl.UserDtoServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;

public class ViewProfileCommand implements Command {

    private static final String PATH_ACCOUNT = "account";

    @Override
    public ResponseContent process(HttpServletRequest request) {
        System.out.println(CommandDirector.MOVE_TO_ACCOUNT.getValue() + " command detected");

        UserDtoServiceImpl userDtoServiceImpl = new UserDtoServiceImpl();

        try {
            userDtoServiceImpl.setDtoFromToken(request);
        } catch (ServiceException e) {
            System.out.println("fail to get dto");
        }

        ResponseContent responseContent = new ResponseContent();
        responseContent.setRouter(new Router(PageDirector.ACCOUNT, Router.Type.FORWARD));
        return responseContent;
    }
}
