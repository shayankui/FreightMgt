package com.kings.ttp.util.constant;

public interface RequestConstants {

	String INFORMATION 			= "information";//信息页面需要的信息对象
	String ADMIN_CHECK_CODE 	= "admin_login_code";//管理员登陆的验证码
	String ADMIN_SESSION_KEY 	= "admin";//管理员存储session 的对象Key
	String RESULT_INFO 			= "resultInfo";//信息页面结果对象
	String ADMIN_POPEDOM		= "admin_popedom";//管理员权限
	String ALL_PERMERSSION		= "all_permerssion";//所有权限
	String CUSTOM_FUNINFOS      = "custom_funs";
	String SYSTEM_FUNINFOS		= "system_funs";
	int ADMIN_GRADE_MANAGE		= 0; //超级管理员
	int ADMIN_GRADE_PROVINCE	= 1; //省
	int ADMIN_GRADE_CITY		= 2; //市

	//后台管理 分页设置
	int EVERY_PAGE_MAXSIZE 		= 10000;				//默认每页显示条数
	int EVERY_PAGE_COUNT 		= 15;					//默认每页显示条数
	String PAGE_CURRENT			= "pageCurrent";		//当前页数
	String PAGE_NEXT			= "pageNext";			//下一页数
	String PAGE_SIZE			= "pageSize";			//每页显示数量
	String TOTAL_PAGE 			= "totalPage";			//总页数
	String TOTAL_COUNT	 		= "totalCount";		//总记录数
	String HANDLE_PATH 			= "handlePath";		//实现业务的路径
	String PAGE_PARAMETER 		= "pageParameter";	//实现业务相关参数

	/**记录*/
	String RESULT_LIST 			= "resultList";
	/**查询表单信息*/
	String QUERY_FORM_BEAN 		= "queryFormBean";
	
	/**用户类型*/
	/**0-普通用户；1-扩展普通用户；2-正常组管理员；3-扩展组管理员*/
	String COM_USER			= "0";
	String EXP_USER			= "1";
	String COM_ADMIN 		= "2";
	String EXP_ADMIN 		= "3";
	/** 权限认证 **/
	String LOGIN_KEY = "ln";
	String MODEL_KEY = "mid";
	String TOKEN_COOKIE_KEY   = "token";
	String SSO_COOKIE_DOMAIN = "127.0.0.1";
	String CURRENT_POSITION = "currentPosition";
	
	/** 重复打印 **/
	String REPEAT_PRINT = "REPEATPRINT";
	

}
