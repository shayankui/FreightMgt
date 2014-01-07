package com.kings.ttp.web.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.kings.ttp.service.iface.IUerService;
import com.kings.ttp.web.frame.HandlerRequestContext;
import com.kings.ttp.web.frame.HandlerResult;
import com.kings.ttp.web.frame.IHandler;
/**
 * 前端用户管理
 * @author Kfighter
 *
 */
public class UserHandler implements IHandler{
	
	private static final Logger log = Logger.getLogger(UserHandler.class);
	
	private IUerService userService;

	public void setUserService(IUerService userService) {
		this.userService = userService;
	}



	/**
	 * 获取新增页面
	 * @param request
	 * @param response
	 * @return
	 */
	public HandlerResult getAllUser(HandlerRequestContext context) {
		HandlerResult result = HandlerResult.newInstance();
		Map<String , Object> retObj = new HashMap<String , Object>();
		retObj.put("menus", "");
		result.setRetObj(retObj);
		return result;
	}
}
