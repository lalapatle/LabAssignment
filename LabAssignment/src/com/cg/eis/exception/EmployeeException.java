package com.cg.eis.exception;

public class EmployeeException extends Exception{
	String message;
	public  EmployeeException(String message) {
		this.message=message;
		
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
