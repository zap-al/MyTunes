package com.mrmrmr7.mytunes.controller.command.impl;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.exception.ServiceException;
import com.mrmrmr7.mytunes.service.UserBonusService;
import com.mrmrmr7.mytunes.service.impl.UserBonusServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;

public class AdminAddUserBonusCommand implements Command {
    @Override
    public ResponseContent process(HttpServletRequest request) {
        System.out.println(CommandDirector.ADMIN_ADD_USER_BONUS.getValue() + " command detected");
        int bonusId = Integer.valueOf(request.getParameter("bonusId"));
        String userLogin = request.getParameter("userLogin");
        UserBonusService userBonusService = new UserBonusServiceImpl();

        try {
            request.setAttribute("success", userBonusService.addBonusToUser(userLogin, bonusId));
        } catch (ServiceException e) {
            System.out.println("ups, upalo");
        }

        ResponseContent responseContent = new ResponseContent();
        responseContent.setRouter(new Router(PageDirector.VIEW_ADMIN_ADD_USER_BONUS_PAGE, Router.Type.FORWARD));
        return responseContent;
    }
}