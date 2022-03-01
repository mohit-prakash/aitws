package com.mps.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

	@GetMapping("/welcome")
	public String welcomeMessage()
	{
		return "Welcome to Rest API Development!!";
	}
	
	@GetMapping("/greets")
	public String greets()
	{
		return "Hey Good Morning!!";
	}
}
