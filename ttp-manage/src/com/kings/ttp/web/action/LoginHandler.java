package com.kings.ttp.web.action;

import org.apache.log4j.Logger;

import com.kings.ttp.pojo.AdminUserInfo;
import com.kings.ttp.service.iface.ILoginService;
import com.kings.ttp.util.RequestUtil;
import com.kings.ttp.util.SessionUtil;
import com.kings.ttp.util.constant.IResultCode;
import com.kings.ttp.util.constant.RequestConstants;
import com.kings.ttp.util.constant.SystemCodeConstants;
import com.kings.ttp.web.frame.HandlerRequestContext;
import com.kings.ttp.web.frame.HandlerResult;
import com.kings.ttp.web.frame.IHandler;

public class LoginHandler implements IHandler{
	
	private static final Logger log = Logger.getLogger(LoginHandler.class);
	
	private ILoginService loginService;
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}



	/**
	 * 获取新增页面
	 * @param request
	 * @param response
	 * @return
	 */
	public HandlerResult loginCheck(HandlerRequestContext context) {
		long begin = System.currentTimeMillis();
		HandlerResult result = HandlerResult.newInstance();

		//登陆帐号
		String loginId 		= RequestUtil.getStrParam(context.getRequest(), "loginId", "");
		//登陆密码 MD5
		String loginPwd 	= RequestUtil.getStrParam(context.getRequest(), "loginPwd", "");

		//判断登陆信息有效性 判断登陆密码是否有效
		if(("".equals(loginId))||("".equals(loginPwd))){
		    result.setRetCode(IResultCode.SYS_FAILED);
			result.setSysCode(SystemCodeConstants.LOGIN_PWD_EMPTY);
			return result;
		}
		//从数据库中获取管理员信息
		AdminUserInfo userInfo  = (AdminUserInfo)loginService.loginCheck(loginId);

		//判断是否取到密码
		if(userInfo==null){
		    result.setRetCode(IResultCode.SYS_FAILED);
            result.setSysCode(SystemCodeConstants.NOT_USER);
			return result;
		}
		
		//判断密码是否正确
		if(!loginPwd.equals(userInfo.getPassword())){
		    result.setRetCode(IResultCode.SYS_FAILED);
            result.setSysCode(SystemCodeConstants.LOGIN_PWD_ERROR);
			return result;
		}
		
		//session中存储登录用户信息
		SessionUtil.setObjectAttribute(context.getRequest(), RequestConstants.ADMIN_SESSION_KEY, userInfo);

		long end = System.currentTimeMillis();
		log.info("login check cost " + (end - begin) + " ms!");
		//进入管理界面
		return result;
	}
}
