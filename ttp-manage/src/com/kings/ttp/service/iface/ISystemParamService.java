package com.kings.ttp.service.iface;

import com.kings.ttp.pojo.SystemParamBean;

/**
 * 系统参数业务逻辑服务
 * 
 * @author Kfighter
 * 
 */
public interface ISystemParamService {
	/**
	 * 新增系统参数
	 * @param param
	 */
	public void addParam(SystemParamBean param);

	/**
	 * 根据ID查询系统参数
	 * @param paramId
	 * @return
	 */
	public SystemParamBean queryParamById(String paramId);
	
}
