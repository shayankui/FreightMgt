package com.kings.ttp.exception;
/**
 * 数据库异常类
 * @author Kfighter
 *
 */
public class ServiceException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5136766583944710749L;
	public ServiceException()
	{		
	}
	
	public ServiceException(Exception e)
	{
		super(e);
	}
	
	public ServiceException(String s)
	{
		super(s);
	}
}
