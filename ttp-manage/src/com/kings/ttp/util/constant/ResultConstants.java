package com.kings.ttp.util.constant;

public interface ResultConstants {

    String ADMIN_LOGIN_OVERTIME = "登录超时或尚未登录系统，请重新登录系统！";

    String ADMIN_LOGIN_INFO_FAILED = "获取管理员信息失败！请和系统管理员联系，确认数据库是否正常！";
    String ADMIN_LOGIN_CODE_FAILED = "登录系统验证码不正确！请重新输入验证码！";
    String ADMIN_LOGIN_EMPTY_FAILED = "登录帐号或登陆密码为空！请重新输入！";
    String ADMIN_LOGIN_BE_FAILED = "登录帐号不存在！请重新输入！";
    String ADMIN_PASSWORD_FAILED = "登录密码不正确！请重新输入！";
    String ADMIN_INVALID = "管理员无效！";
    String LEVEL = "层级太多！！！";

    int SUBMIT_RESULT_SUCCEED = 1;
    int SUBMIT_RESULT_FAILED = 0;
    int SUBMIT_RESULT_ERROR = -1;

    String LOGOUT_SYSTEM_INFO = "您已经安全退出系统！谢谢使用！";
    String POPEDOM_INFO_NOT = "\\n\\n十分抱歉！您没有权限进行该操作！";
    String CHECK_FIELD_EMPTY = "提交内容中存在必填项为空,请返回重新填写，再提交！";
    String CHECK_FIELD_EXIST = "该信息已经系统中存在了，请返回重新设置后提交或查询列表！";
    String CHECK_EXIST_ERROR = "判断信息是否存在时候，系统出错，请检查提交数据的有效性！";

    String QUERY_INFO_SUCCEED = "查询信息操作成功！";
    String QUERY_INFO_FAILED = "查询信息操作失败！请检查提交数据的有效性，再重新操作！";
    String QUERY_INFO_ERROR = "查询信息时，系统出错，请检查数据的有效性或请与管理员联系！";

    String CREATE_INFO_SUCCEED = "新增记录信息操作成功！";
    String CREATE_INFO_FAILED = "新增记录信息操作失败！请检查提交数据的有效性，再重新操作！";
    String CREATE_INFO_ERROR = "新增记录信息操作时，系统出错，请检查数据的有效性或请与管理员联系！";
    String INSERT_INFO_SUCCEED = "保存新增记录信息操作成功！";
    String INSERT_INFO_FAILED = "保存新增记录信息操作失败！请检查提交数据的有效性，再重新操作！";
    String INSERT_INFO_ERROR = "保存新增记录信息时，系统出错，请检查数据的有效性或请与管理员联系！";

    String EDIT_INFO_SUCCEED = "修改记录信息操作成功！";
    String EDIT_INFO_FAILED = "修改记录信息操作失败！请检查提交数据的有效性或该数据已不存在，再重新操作！";
    String EDIT_INFO_ERROR = "修改记录信息时，系统出错，请检查数据的有效性或请与管理员联系！";

    String UPDATE_INFO_SUCCEED = "保存修改记录信息操作成功！";
    String UPDATE_INFO_FAILED = "保存修改记录信息操作失败！请检查提交数据的有效性或该纪录已不存在，再重新操作！";
    String UPDATE_INFO_ERROR = "保存修改记录信息时，系统出错，请检查数据的有效性或请与管理员联系！";

    String DELETE_INFO_SUCCEED = "删除选择的记录信息操作成功！";
    String DELETE_INFO_FAILED = "删除选择的记录信息操作失败！请检查提交数据的有效性或该纪录已不存在，再重新操作！";
    String DELETE_INFO_ERR0R = "删除选择的记录信息时，系统出错，请检查数据的有效性或请与管理员联系！";
    String DELETE_INFO = "该记录已被其他地方引用，不能删除";
    String UPDATE_INFO = "该记录主键已被其他地方引用，不能修改";
    String VIEW_INFO_FAILED = "显示信息详细资料操作失败！请检查提交数据的有效性，再重新操作！";
    String VIEW_INFO_ERR0R = "显示信息详细资料操作时，系统出错，请检查数据的有效性或请与管理员联系！";

    String DELETE_INFO_ERROR = "您选择的记录进行删除时，系统出错，请检查数据的有效性！";
    String CHECK_EXIT_MEMBER = "该用户组下存在用户，不可删除！请删除所有用户后再删除！";

    String MEMCACHE_INIT_FAIL = "Memcache 重新启动失败，请稍候再试!";
    String SERVER_BUSY = "系统繁忙，请稍候再试!";
    
    String QUERY_MARKET_CANCEL_TYPE_ERROR = "查询营销案回退方式出错，无法回退，请稍候再试！";
}
