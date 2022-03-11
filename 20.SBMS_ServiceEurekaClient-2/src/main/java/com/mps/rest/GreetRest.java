package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRest {

	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg()
	{
		return new ResponseEntity<String>("Good Morning!!",HttpStatus.OK);
	}
}
