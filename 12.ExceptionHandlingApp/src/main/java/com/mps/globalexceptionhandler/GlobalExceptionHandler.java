package com.mps.globalexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mps.userdefinedexception.NoDataFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<String> ArithExcHandler(ArithmeticException ae)
	{
		return new ResponseEntity<String>("can't divide with zero.",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<String> NPEHandler(NullPointerException npe)
	{
		return new ResponseEntity<String>("can't perform operation on null.",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<String> NDFEHandler(NoDataFoundException ndfe)
	{
		String msg=ndfe.getMessage();
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
	}
}
