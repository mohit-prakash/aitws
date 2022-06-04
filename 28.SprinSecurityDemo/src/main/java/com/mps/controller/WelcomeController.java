package com.mps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String GetWelcomeMsg()
	{
		return "Welcome to Spring Security!!";
	}
}
