package com.kings.ttp.service.iface;

import java.util.List;

import com.kings.ttp.pojo.AdminMenuList;
import com.kings.ttp.pojo.UserBean;

/**
 * 管理前端用户业务逻辑服务
 * @author Kfighter
 *
 */
public interface IUerService {
	/**
	 * 分页获取所有用户
	 * @param username
	 * @return
	 */
	public List<UserBean> getMenuList();
}
