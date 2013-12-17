package com.kings.ttp.datasource;
/**
 * 控制多线程并发获取用户操作类型
 * @author Kfighter
 *
 */
public class CustomerContextHolder {
	private static final ThreadLocal contextHolder = new ThreadLocal();

	public static void setCustomerType(String customerType) {

		contextHolder.set(customerType);

	}

	public static String getCustomerType() {

		return (String) contextHolder.get();

	}

	public static void clearCustomerType() {

		contextHolder.remove();

	}

}
