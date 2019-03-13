package com.mrmrmr7.mytunes.controller.command.impl;

import com.mrmrmr7.mytunes.controller.command.Command;
import com.mrmrmr7.mytunes.controller.command.CommandDirector;
import com.mrmrmr7.mytunes.entity.ResponseContent;
import com.mrmrmr7.mytunes.entity.Router;
import com.mrmrmr7.mytunes.service.BalanceService;
import com.mrmrmr7.mytunes.service.ServiceException;
import com.mrmrmr7.mytunes.service.impl.BalanceServiceImpl;
import com.mrmrmr7.mytunes.util.PageDirector;

import javax.servlet.http.HttpServletRequest;

public class ViewShopAlbumCommand implements Command {
    @Override
    public ResponseContent process(HttpServletRequest request) {
        System.out.println(CommandDirector.VIEW_ALBUM_SHOP.getValue() + " command detected");
        ResponseContent responseContent = new ResponseContent();
        responseContent.setRouter(new Router(PageDirector.ALBUM_SHOP, Router.Type.FORWARD));
        return responseContent;
    }
}
