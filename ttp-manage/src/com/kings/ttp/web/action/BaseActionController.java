
package com.kings.ttp.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.kings.ttp.pojo.BaseResultBean;
import com.kings.ttp.util.JSONUtil;

/**
 * 
 * 项目通用的Controller基类，留作扩展
 *
 */
public class BaseActionController extends MultiActionController {
	/**
	 * 输出json
	 * @param response
	 * @param jsonObj
	 */
	public void outResult(HttpServletResponse response,BaseResultBean bean)
	{	
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = null;
		try {
			out=response.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.print(JSONUtil.toJSONString(bean));
		out.flush();
		out.close();
	}
	
	protected void doResponse(HttpServletResponse response, String jsonStr)  {
		try {
			response.getWriter().print(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
