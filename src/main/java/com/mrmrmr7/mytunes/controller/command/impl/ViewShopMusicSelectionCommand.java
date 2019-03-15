package com.mrmrmr7.mytunes.controller.command.impl;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.MusicSelectionInfo;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.BalanceService;
import com.mrmrmr7.mytunes.service.MusicSelectionInfoService;
import com.mrmrmr7.mytunes.service.ServiceException;
import com.mrmrmr7.mytunes.service.impl.BalanceServiceImpl;
import com.mrmrmr7.mytunes.service.impl.MusicSelectionInfoServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;

public class ViewShopMusicSelectionCommand implements Command {
    @Override
    public ResponseContent process(HttpServletRequest request) {
        System.out.println(CommandDirector.VIEW_MUSIC_SELECTION_SHOP.getValue() + " command detected");
        MusicSelectionInfoService musicSelectionInfoService = new MusicSelectionInfoServiceImpl();
        try {
            request.setAttribute("musicSelectionInfoList", musicSelectionInfoService.getAllNotUserMusicSelectionInfo(request));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        ResponseContent responseContent = new ResponseContent();
        responseContent.setRouter(new Router(PageDirector.MUSIC_SELECTION_SHOP, Router.Type.FORWARD));
        return responseContent;
    }
}
