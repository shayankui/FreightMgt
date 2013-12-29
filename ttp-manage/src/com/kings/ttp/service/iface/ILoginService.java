package com.kings.ttp.service.iface;

import com.kings.ttp.pojo.AdminUserInfo;

/**
 * 登录业务逻辑处理类
 * @author Kfighter
 *
 */
public interface ILoginService {
	
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	public AdminUserInfo loginCheck(String username);
}
