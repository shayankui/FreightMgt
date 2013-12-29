package com.kings.ttp.web.frame;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class ResultMsgFormatImpl implements IResultMsgFormat
{
    protected static final Logger logger = Logger.getLogger(ResultMsgFormatImpl.class);

    public void formatResultMsg(HandlerResult result)
    {
        String resultMsg = "";
        try
        {
            if (result != null)
            {
                if (StringUtils.isBlank(result.getSysCode()))
                {
                    resultMsg = "系统忙，请稍候再试！";
                }
                else
                {
                    resultMsg = queryResultMsgInfo(result.getSysCode());
                }
            }
            if (StringUtils.isBlank(resultMsg))
            {
                resultMsg = "系统忙，请稍候再试！";
            }
        }
        catch (Exception ex)
        {
            resultMsg = "系统忙，请稍候再试！";
            logger.error(ex, ex);
        }

        result.setResMsg(resultMsg);
    }

    private String queryResultMsgInfo(String systemCode)
    {
        String resultMsg = "";
       
        return resultMsg;
    }
}
