package com.kings.ttp.web.frame;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.kings.ttp.pojo.PageDynamicRequestInfo;
import com.kings.ttp.util.JSONUtil;
import com.kings.ttp.util.constant.IResultCode;

public class TtpAction extends MultiActionController
{
    private IResultMsgFormat resultMsgFormat;

    /**
     * 统一入口
     *
     * @param request
     * @param response
     */
    public void defaultHandle(HttpServletRequest request, HttpServletResponse response)
    {
        response.setContentType("text/plain;charset=UTF-8");
        try
        {
            Object retObj = dispatchRequest(request, response);
            String s = JSONUtil.toJSONString(retObj);
            PrintWriter pw = response.getWriter();
            pw.print(s);
            pw.close();
        }
        catch (Exception ex)
        {
            logger.error(ex, ex);
            throw new RuntimeException("UOMP REQUEST HANDLE ERROR!", ex);
        }
    }

    /**
     * 分发请求
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    private Object dispatchRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        Object ret = null;
        String jsonParam = request.getParameter("jsonParam");
        if (!StringUtils.isBlank(jsonParam))
        {
            List<PageDynamicRequestInfo> requests = JSONUtil.toBeanList(jsonParam, PageDynamicRequestInfo.class);
            ret = multiRequests(requests, request, response);
        }
        else
        {
            ret = singleRequest(request, response);
        }
        return ret;
    }

    /**
     * 多个请求
     *
     * @param requests
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    private Object multiRequests(List<PageDynamicRequestInfo> requests, final HttpServletRequest request, final HttpServletResponse response)
            throws Exception
    {
        final Map<String, Object> ret = new HashMap<String, Object>();
        if (requests.size() > 1)
        {
            final CountDownLatch countDownLatch = new CountDownLatch(requests.size());
            for (int i = 0; i < requests.size(); i++)
            {
                final PageDynamicRequestInfo tmpReq = requests.get(i);
                /*ExecutorPool.getInstance().exe(new Runnable()
                {
                    public void run()
                    {
                        ret.put(tmpReq.getDynamicDataNodeName(), multiRequest(tmpReq, request, response));
                        countDownLatch.countDown();
                    }
                });*/

            }
            countDownLatch.await(100, TimeUnit.SECONDS);
        }
        else
        {
            PageDynamicRequestInfo tmpReq = requests.get(0);
            ret.put(tmpReq.getDynamicDataNodeName(), multiRequest(tmpReq, request, response));
        }
        return ret;
    }

    /**
     * 处理多个请求
     *
     * @param requestInfo
     * @param request
     * @param response
     * @return
     */
    private Object multiRequest(PageDynamicRequestInfo requestInfo, HttpServletRequest request, HttpServletResponse response)
    {
        HandlerResult result = null;
        try
        {
            HandlerRequestContext reqContext = new HandlerRequestContext(request, response);
            reqContext.setReqParam(requestInfo.getDynamicParameter());
            IHandler handler = findHandler(requestInfo.getDynamicURI(), request);
            String reqMethod = requestInfo.getDynamicParameter().get("reqMethod");
            Method m = handler.getClass().getMethod(reqMethod, new Class[]
            { HandlerRequestContext.class });
            result = (HandlerResult) m.invoke(handler, new Object[]
            { reqContext });
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = HandlerResult.newInstance(IResultCode.SYS_FAILED);
        }
        finally
        {
            genResultMsg(result);
        }

        return result;
    }

    /**
     * 单个请求
     *
     * @param request
     * @param response
     * @return
     */
    private Object singleRequest(HttpServletRequest request, HttpServletResponse response)
    {
        HandlerResult result = null;
        try
        {
            HandlerRequestContext reqContext = new HandlerRequestContext(request, response);
            String reqUrl = request.getParameter("reqUrl");
            IHandler handler = findHandler(reqUrl, request);
            String reqMethod = request.getParameter("reqMethod");
            Method m = handler.getClass().getMethod(reqMethod, new Class[]
            { HandlerRequestContext.class });
            result = (HandlerResult) m.invoke(handler, new Object[]
            { reqContext });
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = HandlerResult.newInstance(IResultCode.SYS_FAILED);
        }
        finally
        {
            genResultMsg(result);
        }
        return result;
    }

    /**
     * 查找Handler
     *
     * @param request
     * @return
     */
    private IHandler findHandler(String reqUrl, HttpServletRequest request)
    {
        if (reqUrl.startsWith("/"))
        {
            reqUrl = reqUrl.substring(1);
        }
        reqUrl = "H_" + reqUrl.replaceAll("\\/", "_");
        ApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
        return (IHandler) springContext.getBean(reqUrl);
    }

    /**
     * 构造返回提示信息
     *
     * @param request
     * @param cdsResult
     */
    private void genResultMsg(HandlerResult result)
    {
        resultMsgFormat.formatResultMsg(result);
    }

    public IResultMsgFormat getResultMsgFormat()
    {
        return resultMsgFormat;
    }

    public void setResultMsgFormat(IResultMsgFormat resultMsgFormat)
    {
        this.resultMsgFormat = resultMsgFormat;
    }
}
