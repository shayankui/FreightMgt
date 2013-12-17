package com.kings.ttp.web.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;

import com.kings.ttp.pojo.BaseResultBean;
import com.kings.ttp.pojo.SystemParamBean;
import com.kings.ttp.service.iface.ISystemParamService;
import com.kings.ttp.util.RequestUtil;
import com.kings.ttp.util.constant.ResultConstants;

/**
 * 系统参数维护Controller
 * 
 * @author Kfighter
 *
 */
public class SysParaController extends BaseActionController {
	private static final Logger log = Logger.getLogger(SysParaController.class);
	/**
	 * 注入Service
	 */
	private ISystemParamService systemParamService;

	public void setSystemParamService(ISystemParamService systemParamService) {
		this.systemParamService = systemParamService;
	}

	public ModelAndView defaultHandle(HttpServletRequest request,HttpServletResponse response) {
		return new ModelAndView("/WEB-INF/jsp/system/sys_param_add");
	}
	
	
	/**
	 * 获取新增页面
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView getAddPage(HttpServletRequest request,HttpServletResponse response) {
		return new ModelAndView("/WEB-INF/jsp/system/sys_param_add");
	}
	
	/**
	 * 新增系统参数信息
	 * @param request
	 * @param response
	 * @return
	 */
	public void saveSysPara(HttpServletRequest request,HttpServletResponse response) {
		BaseResultBean result = new BaseResultBean();
		try{
			SystemParamBean sysPara = getRequestValue(request);
		    if(StringUtils.isBlank(sysPara.getCsbm())){
			    //提示必须填写子段为空
		    	result.setErrorCode("");
		    	result.setSuccess(false);
		    	result.setErrorMsg(ResultConstants.CHECK_FIELD_EMPTY);
		    }else{
		    	systemParamService.addParam(sysPara);
		    }
		}catch(Exception e){
			result.setErrorCode("");
			result.setSuccess(false);
			result.setErrorMsg( ResultConstants.INSERT_INFO_ERROR);
		}
		outResult(response,result);
	}

	/**
	 * 从页面获取数据
	 * @param request
	 * @return
	 * @throws Exception
	 */
	private SystemParamBean getRequestValue(HttpServletRequest request) throws Exception{
		String csbm 		= RequestUtil.getStrParam(request, "csbm", "");
		String csmc 		= RequestUtil.getStrParam(request, "csmc", "");
		String csz 			= RequestUtil.getStrParam(request, "csz", "");
		String bz 			= RequestUtil.getStrParam(request, "bz", "");
		SystemParamBean bean = new SystemParamBean();
		bean.setCsbm(csbm);
		bean.setCsmc(csmc);
		bean.setCsz(csz);
		bean.setBz(bz);
		return bean;
	}

}
