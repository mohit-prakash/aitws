package com.mps.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public ResponseEntity<String> demo()
	{
		String msg=null;
		msg.length(); //Null Pointer Exception
		String str="Hello World";
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@ExceptionHandler
	public ResponseEntity<String> NPEHandler(NullPointerException npe)
	{
		return new ResponseEntity<String>("can't find length of null",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
