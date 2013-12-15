package com.kings.ttp.service.impl;

import org.apache.log4j.Logger;

import com.kings.ttp.dao.iface.ISystemParamDAO;
import com.kings.ttp.dao.impl.SystemParamDAOImpl;
import com.kings.ttp.exception.DAOException;
import com.kings.ttp.exception.ServiceException;
import com.kings.ttp.pojo.SystemParamBean;
import com.kings.ttp.service.iface.ISystemParamService;
/**
 * 系统参数业务逻辑服务
 * 
 * @author Kfighter
 * 
 */
public class SystemParamServiceImpl implements ISystemParamService{
	
	private static final Logger logger = Logger.getLogger(SystemParamServiceImpl.class);
	
	/**
	 * 系统参数DAO
	 */
	private ISystemParamDAO systemParamDAO;
	public void setSystemParamDAO(ISystemParamDAO systemParamDAO) {
		this.systemParamDAO = systemParamDAO;
	}

	/**
	 * 新增系统参数
	 * @param param
	 */
	public void addParam(SystemParamBean param)
	{
		try {
			systemParamDAO.addParam(param);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
	}

	/**
	 * 根据ID查询系统参数
	 * @param paramId
	 * @return
	 */
	public SystemParamBean queryParamById(String paramId)
	{
		try {
			return systemParamDAO.queryParam(paramId);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
	}
}
