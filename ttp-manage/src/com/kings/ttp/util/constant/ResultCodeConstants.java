package com.kings.ttp.util.constant;

public interface ResultCodeConstants {
	String RESULT_SUCCEED = "0000";
	String NOT_LOGIN = "1001";
	String NOT_POWER = "1002";
	
	//60W-等待执行,60K-执行成功,60F-执行失败,70W-锁定
	String TASK_STATUS_WAIT = "60W";
	String TASK_STATUS_SUCCESS = "60K";
	String TASK_STATUS_FAIL = "60F";
	String TASK_STATUS_LOCKED = "70W";
	
	
}
