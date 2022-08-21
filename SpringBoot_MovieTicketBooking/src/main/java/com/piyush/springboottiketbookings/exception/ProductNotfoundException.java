package com.piyush.springboottiketbookings.exception;

public class ProductNotfoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public String cityCheck()
	{
		return "City Not Found";
	}
}
