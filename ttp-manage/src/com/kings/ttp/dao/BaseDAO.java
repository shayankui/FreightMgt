package com.kings.ttp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.kings.ttp.WebApp;
import com.kings.ttp.exception.DAOException;

/**
 * 数据库访问基类
 * @author Kfighter
 *
 */
public class BaseDAO extends JdbcDaoSupport {
	
	private static final Logger logger = Logger.getLogger(BaseDAO.class);
	
	/**
	 * 查询,强制使用该方法
	 * @param sql
	 * @param params
	 * @return
	 */
	public List query(String sql , Object[] args)  throws DAOException
	{
		JdbcTemplate jt = this.getJdbcTemplate();
		jt.setDataSource((DataSource)WebApp.SPRING_CONTEXT.getBean("readDataSource"));
		return jt.queryForList(sql, args);
	}
	
	/**
	 * 修改数据,强制使用该方法
	 * @param sql
	 * @param params
	 * @return
	 */
	public int update(String sql , Object[] args) throws DAOException
	{
		JdbcTemplate jt = this.getJdbcTemplate();
		jt.setDataSource((DataSource)WebApp.SPRING_CONTEXT.getBean("writeDataSource"));
		return jt.update(sql, args);
	}
	
	
}
