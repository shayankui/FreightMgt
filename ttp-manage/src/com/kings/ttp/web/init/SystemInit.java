package com.kings.ttp.web.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import com.kings.ttp.WebApp;

/**
 * 系统初始化类
 * 
 * @author Kfighter
 * 
 */
public class SystemInit implements ServletContextListener {


	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent context) {
		WebApp.SPRING_CONTEXT = WebApplicationContextUtils.getWebApplicationContext(context.getServletContext());

	}

}
