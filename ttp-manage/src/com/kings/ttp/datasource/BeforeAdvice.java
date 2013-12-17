package com.kings.ttp.datasource;
/**
 * 数据源AOP前置通知
 * @author Kfighter
 *
 */
public class BeforeAdvice {
	
	public void setWriteDataSource() {

		CustomerContextHolder.setCustomerType("write");

	}

	public void setReadDataSource() {

		CustomerContextHolder.setCustomerType("read");

	}

}
