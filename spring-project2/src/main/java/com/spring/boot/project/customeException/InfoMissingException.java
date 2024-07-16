package com.spring.boot.project.customeException;

@SuppressWarnings("serial")
public class InfoMissingException extends RuntimeException{
	
	public InfoMissingException(String msg) {
		
		
		super(msg);
	}

}
