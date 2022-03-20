package com.mps.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mps.clients.GreetMsgClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetMsgClient greetClient;

//	@GetMapping("/welcome")
//	public String welcome()
//	{
//		return "Welcome";
//	}
	
	@GetMapping("/welcome")
	public String getMsg()
	{
		String greetMsg=greetClient.getGreetMsg();
		return "Welcome... "+greetMsg;
	}
}
