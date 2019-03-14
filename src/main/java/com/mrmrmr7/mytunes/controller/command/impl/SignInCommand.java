package com.mrmrmr7.mytunes.controller.command.impl;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.ServiceException;
import com.mrmrmr7.mytunes.service.impl.UserServiceImpl;
import com.mrmrmr7.mytunes.service.impl.UserDtoServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInCommand implements Command {

    @Override
    public ResponseContent process(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        System.out.println(CommandDirector.SIGN_IN.getValue() + " command in detected");

        String login = request.getParameter(CommandDirector.LOGIN.getValue());
        String password = request.getParameter(CommandDirector.PASSWORD.getValue());

        boolean isSignIn = false;

        try {
            UserServiceImpl serviceUser = new UserServiceImpl();
            isSignIn = serviceUser.login(login, password, httpServletResponse);//request.getSession(false));
            if (isSignIn) {
                UserDtoServiceImpl userDtoServiceImpl = new UserDtoServiceImpl();
                userDtoServiceImpl.setDtoByLogin(login, request);
            }
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        ResponseContent responseContent = new ResponseContent();

        if (isSignIn) {
            responseContent.setRouter(new Router(PageDirector.ACCOUNT, Router.Type.FORWARD));
        } else {
            responseContent.setRouter(new Router(PageDirector.LANDING, Router.Type.REDIRECT));
        }

        return responseContent;
    }

    @Override
    public ResponseContent process(HttpServletRequest request) {
        ResponseContent responseContent = new ResponseContent();
        responseContent.setRouter(new Router(PageDirector.LANDING, Router.Type.REDIRECT));
        return responseContent;
    }
}