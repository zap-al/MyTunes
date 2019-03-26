package com.mrmrmr7.mytunes.controller.command.impl;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.AlbumFeedbackService;
import com.mrmrmr7.mytunes.service.exception.ServiceException;
import com.mrmrmr7.mytunes.service.impl.AlbumFeedbackServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddAlbumFeedbackCommand implements Command {

    @Override
    public ResponseContent process(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(CommandDirector.ADD_ALBUM_FEEDBACK.getValue() + " command detected");

        AlbumFeedbackService albumFeedbackDtoService = new AlbumFeedbackServiceImpl();

        try {
            request.setAttribute("albumName", request.getParameter("albumName"));
            request.setAttribute("success", albumFeedbackDtoService.addAlbumFeedback(request));
            request.setAttribute("userAlbumFeedbackList", albumFeedbackDtoService.getUserAlbumFeedbackList(request));
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        ResponseContent responseContent = new ResponseContent();

        responseContent.setRouter(new Router(PageDirector.VIEW_ALBUM_FEEDBACK, Router.Type.FORWARD));

        return responseContent;
    }
}
