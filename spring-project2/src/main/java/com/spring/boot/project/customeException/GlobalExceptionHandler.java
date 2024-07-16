package com.spring.boot.project.customeException;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InfoMissingException.class)
	public  Map<String, String> InfoMissingExceptionhandler(InfoMissingException ex){

		Map<String, String> ermap=new HashMap<>();
		String str=ex.getMessage();
		ermap.put("erorMessage",str );
		return ermap;
		
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public Map<String, String> productNotFoundExceptionhandler(ProductNotFoundException ex){
		
		Map<String, String> ermap=new HashMap<>();
		String str=ex.getMessage();
		ermap.put("erorMessage",str );
		
		
//	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(str);
		return ermap;
		
	}
}
