package com.kings.ttp.service.impl;

import org.apache.log4j.Logger;

import com.kings.ttp.dao.automated.AdminUserInfoMapper;
import com.kings.ttp.pojo.AdminUserInfo;
import com.kings.ttp.pojo.AdminUserInfoExample;
import com.kings.ttp.service.iface.ILoginService;

/**
 * 登录业务逻辑处理类
 * 
 * @author Kfighter
 * 
 */
public class LoginServiceImpl implements ILoginService {
	private static final Logger logger = Logger
			.getLogger(LoginServiceImpl.class);
	
	private AdminUserInfoMapper adminUserInfoMapper;
	public void setAdminUserInfoMapper(AdminUserInfoMapper adminUserInfoMapper) {
		this.adminUserInfoMapper = adminUserInfoMapper;
	}


	/**
	 * 登录校验
	 */
	public AdminUserInfo loginCheck(String username) {
		return adminUserInfoMapper.selectByUsername(username);
	}

}
