package com.kings.ttp.web.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.kings.ttp.WebApp;

/**
 * 系统初始化类
 * 
 * @author Kfighter
 * 
 */
public class SystemInit implements ServletContextListener {
	public void init() {
		WebApp.context = null;
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

}
