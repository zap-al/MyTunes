package com.mrmrmr7.mytunes.service;

import com.mrmrmr7.mytunes.entity.Composition;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserCompositionService {
    List<Composition> showUserComposition(HttpServletRequest request) throws ServiceException;
}
