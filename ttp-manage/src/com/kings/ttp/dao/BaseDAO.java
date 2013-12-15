package com.kings.ttp.dao;

import java.util.List;
import java.util.Map;

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
	 * 查询
	 * @param sql
	 * @param params
	 * @return
	 */
	public List query(String sql , String[] args)  throws DAOException
	{
		JdbcTemplate jt = (JdbcTemplate)WebApp.SPRING_CONTEXT.getBean("readJdbcTemplate");
		return jt.queryForList(sql, args);
	}
	
	/**
	 * 修改数据
	 * @param sql
	 * @param params
	 * @return
	 */
	public int update(String sql , String[] args) throws DAOException
	{
		JdbcTemplate jt = (JdbcTemplate)WebApp.SPRING_CONTEXT.getBean("writeJdbcTemplate");
		return jt.update(sql, args);
	}
	
	
}
