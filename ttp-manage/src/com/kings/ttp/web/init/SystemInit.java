package com.kings.ttp.web.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.kings.ttp.WebApp;
import com.kings.ttp.datasource.CustomerContextHolder;

/**
 * 系统初始化类
 * 
 * @author Kfighter
 * 
 */
public class SystemInit implements ServletContextListener {

	private static final Logger logger = Logger.getLogger(SystemInit.class);

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * 初始化
	 */
	public void contextInitialized(ServletContextEvent context) {
		
		WebApp.SPRING_CONTEXT = WebApplicationContextUtils.getWebApplicationContext(context.getServletContext());
		CustomerContextHolder.setCustomerType("read");
		logger.info("系统初始化成功...");
	}

}
