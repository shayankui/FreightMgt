package com.kings.ttp.util;

import java.util.Collection;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * JSON工具类
 * @author Kfighter
 *
 */
public class JSONUtil {
	/**
	 * 转换object为JSON字符串
	 * @param obj
	 * @return
	 */
	public static String toJSONString(Object obj){
		return JSONObject.fromObject(obj).toString();
	}
	
	/**
	 * 转换object为JSON字符串
	 * @param obj
	 * @return
	 */
	public static String toJSONArrayString(Collection c){
		return JSONArray.fromObject(c).toString();
	}
	
	/**
	 * 将jsonArray转换为List<Bean>
	 * @param arr
	 * @param objClass
	 * @return
	 */
	public static List toBeanList(Object arr , Class objClass){
		return (List)JSONArray.toCollection( JSONArray.fromObject(arr),objClass);
	}
	/**
	 * 将obj(一般为jsonString)转换为Bean
	 * @param obj
	 * @param objClass
	 * @return
	 */
	public static Object toBean(Object obj , Class objClass){
		return JSONObject.toBean(JSONObject.fromObject(obj), objClass);
	}

	
}
