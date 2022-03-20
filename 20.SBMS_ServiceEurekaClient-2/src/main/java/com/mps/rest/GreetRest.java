package com.mps.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRest {

	@GetMapping("/greet")
	public String greetMsg()
	{
		return "Good Morning!!";
	}
}
