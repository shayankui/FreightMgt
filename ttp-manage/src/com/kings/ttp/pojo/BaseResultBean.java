package com.kings.ttp.pojo;

import java.util.Map;

/**
 * 增、删、改操作结果
 * @author Kfighter
 *
 */
public class BaseResultBean {
	//返回编码
	private String retCode;
	//系统返回码/错误码
    private String sysCode;
	//返回消息
	private String resMsg;
	//返回结果集
	private Object retObj;

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getResMsg() {
		return resMsg;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}

	public Object getRetObj() {
		return retObj;
	}

	public void setRetObj(Object retObj) {
		this.retObj = retObj;
	}
	
}
