package com.mps.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	Logger logger=LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		logger.info("Execution Started!!");
		String msg="Hello World!!";
		logger.info("Execution Ended!!");
		return msg;
	}
}
