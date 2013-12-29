package com.kings.ttp.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.kings.ttp.pojo.AdminMenuList;
import com.kings.ttp.pojo.AdminUserInfo;
import com.kings.ttp.service.iface.IMenuService;
import com.kings.ttp.util.SessionUtil;
import com.kings.ttp.util.constant.IResultCode;
import com.kings.ttp.util.constant.RequestConstants;
import com.kings.ttp.util.constant.ResultConstants;
import com.kings.ttp.web.frame.HandlerRequestContext;
import com.kings.ttp.web.frame.HandlerResult;
import com.kings.ttp.web.frame.IHandler;

public class MenuHandler implements IHandler{
	
	private static final Logger log = Logger.getLogger(MenuHandler.class);
	
	private IMenuService menuService;
	public void setMenuService(IMenuService menuService) {
		this.menuService = menuService;
	}

	/**
	 * 获取新增页面
	 * @param request
	 * @param response
	 * @return
	 */
	public HandlerResult getMenuList(HandlerRequestContext context) {
		HandlerResult result = HandlerResult.newInstance();
		AdminUserInfo admin = (AdminUserInfo)SessionUtil.getObjectAttribute(context.getRequest(), RequestConstants.ADMIN_SESSION_KEY);
		if(null == admin)
		{
			result.setRetCode(IResultCode.SYS_FAILED);
			result.setSysCode(ResultConstants.ADMIN_LOGIN_INFO_FAILED);
			return result;
		}
		List<AdminMenuList> menus = menuService.getMenuList(admin.getGroupId());
		Map<String , Object> retObj = new HashMap<String , Object>();
		retObj.put("menus", menus);
		result.setRetObj(retObj);
		return result;
	}
}
