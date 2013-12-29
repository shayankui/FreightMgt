package com.kings.ttp.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.kings.ttp.dao.automated.AdminMenuListMapper;
import com.kings.ttp.pojo.AdminMenuList;
import com.kings.ttp.service.iface.IMenuService;

/**
 * 管理系统菜单逻辑服务
 * 
 * @author Kfighter
 * 
 */
public class MenuServiceImpl implements IMenuService {
	private static final Logger logger = Logger
			.getLogger(MenuServiceImpl.class);
	
	private AdminMenuListMapper adminMenuListMapper;
	public void setAdminMenuListMapper(AdminMenuListMapper adminMenuListMapper) {
		this.adminMenuListMapper = adminMenuListMapper;
	}


	/**
	 * 根据系统用户获取该用户菜单
	 * 
	 * @param username
	 * @return
	 */
	public List<AdminMenuList> getMenuList(Integer groupId)
	{
		List<AdminMenuList> menus = null;
		menus = adminMenuListMapper.selectByGroup(groupId);
		return menus;
	}
}
