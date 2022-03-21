package com.mps.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg()
	{
		String port=env.getProperty("server.port");
		return new ResponseEntity<String>("Good Evening....... Port Number: "+port,HttpStatus.OK);
	}
}
