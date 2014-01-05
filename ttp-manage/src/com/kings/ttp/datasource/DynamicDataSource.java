package com.kings.ttp.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * 动态数据源实现
 * @author Kfighter
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		return CustomerContextHolder.getCustomerType();
	}
}
