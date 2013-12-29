package com.kings.ttp.service.iface;

import java.util.List;

import com.kings.ttp.pojo.AdminMenuList;

/**
 * 管理系统菜单逻辑服务
 * @author Kfighter
 *
 */
public interface IMenuService {
	/**
	 * 根据系统用户获取该用户菜单
	 * @param username
	 * @return
	 */
	public List<AdminMenuList> getMenuList(Integer groupId);
}
