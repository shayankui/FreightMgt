package com.kings.ttp.exception;

public class DAOException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5136766583944710749L;
	public DAOException()
	{		
	}
	
	public DAOException(Exception e)
	{
		super(e);
	}
	
	public DAOException(String s)
	{
		super(s);
	}
}
