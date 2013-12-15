package com.kings.ttp.dao.iface;

import com.kings.ttp.exception.DAOException;
import com.kings.ttp.pojo.SystemParamBean;

/**
 * 系统参数DAO
 * @author Kfighter
 *
 */
public interface ISystemParamDAO {
	
	/**
	 * 新增参数
	 * @param param
	 * @throws DAOException
	 */
	public void addParam(SystemParamBean param) throws DAOException;
	
	/**
	 * 修改参数(根据主键修改)
	 * @param param
	 * @throws DAOException
	 */
	public void updateParam(SystemParamBean param) throws DAOException;
	
	/**
	 * 根据主键删除参数
	 * @param cmbm
	 * @throws DAOException
	 */
	public void deleteParam(String cmbm) throws DAOException;
	
	/**
	 * 根据主键查询参数
	 * @param cmbm
	 * @throws DAOException
	 */
	public SystemParamBean queryParam(String cmbm) throws DAOException;
	
}
