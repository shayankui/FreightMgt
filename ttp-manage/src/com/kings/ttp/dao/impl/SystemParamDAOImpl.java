package com.kings.ttp.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.kings.ttp.dao.BaseDAO;
import com.kings.ttp.dao.iface.ISystemParamDAO;
import com.kings.ttp.exception.DAOException;
import com.kings.ttp.pojo.SystemParamBean;
import com.kings.ttp.util.StringUtil;

/**
 * 系统参数DAO
 * 
 * @author Kfighter
 * 
 */
public class SystemParamDAOImpl extends BaseDAO implements ISystemParamDAO {
	private static final Logger logger = Logger
			.getLogger(SystemParamDAOImpl.class);

	/**
	 * 新增参数
	 * 
	 * @param param
	 * @throws DAOException
	 */
	public void addParam(SystemParamBean param) throws DAOException {
		String sql = "INSERT INTO T_SYSTEM (F_CSBM,F_CSMC,F_CSZ,F_BZ) VALUES(?,?,?,?)";
		int result = update(sql, new Object[]{
				param.getCsbm(),
				param.getCsmc(),
				param.getCsz(),
				param.getBz()
		});
		if(result < 1)
		{
			throw  new DAOException("新增系统参数失败");
		}
	}

	/**
	 * 修改参数(根据主键修改)
	 * 
	 * @param param
	 * @throws DAOException
	 */
	public void updateParam(SystemParamBean param) throws DAOException {
		String sql = "UPDATE T_SYSTEM T"
			+ " SET T.F_CSMC = ? , T.F_CSZ = ? , T.F_BZ = ?"
			+ " WHERE T.F_CSBM = ?";
		int result = update(sql, new Object[]{
				param.getCsmc(),
				param.getCsz(),
				param.getBz(),
				param.getCsbm()
		});
		if(result < 1)
		{
			throw  new DAOException("修改系统参数失败,未找到该系统参数,csbm = " + param.getCsbm());
		}
	}

	/**
	 * 根据主键删除参数
	 * 
	 * @param cmbm
	 * @throws DAOException
	 */
	public void deleteParam(String csbm) throws DAOException {
		String sql = "DELETE FROM  T_SYSTEM T WHERE T.F_CSBM = ?";
		int result = update(sql, new Object[]{
				csbm
		});
		if(result < 1)
		{
			throw  new DAOException("删除系统参数失败,未找到该系统参数,csbm = " + csbm);
		}
	}

	/**
	 * 根据主键查询参数
	 * 
	 * @param cmbm
	 * @throws DAOException
	 */
	public SystemParamBean queryParam(String csbm) throws DAOException {
		String sql = "SELECT * FROM T_SYSTEM T WHERE T.F_CSBM = ?";
		List<Map> list = query(sql, new Object[]{
				csbm
		});
		if(!StringUtil.listIsEmpty(list))
		{
			return paramMap2Bean(list.get(0));
		}
		return null;
	}
	/**
	 * ORM转化实体
	 * @param map
	 * @return
	 */
	private SystemParamBean paramMap2Bean(Map map)
	{
		SystemParamBean bean = new SystemParamBean();
		bean.setCsbm((String)map.get("F_CSBM"));
		bean.setCsmc((String)map.get("F_CSMC"));
		bean.setCsz((String)map.get("F_CSZ"));
		bean.setBz((String)map.get("F_BZ"));
		return bean;
	}
	
}
