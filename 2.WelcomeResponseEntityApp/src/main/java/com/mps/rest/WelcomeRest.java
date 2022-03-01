package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome()
	{
			String msg="Welcome to RestEntity";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
