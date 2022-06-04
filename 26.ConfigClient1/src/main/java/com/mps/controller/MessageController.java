package com.mps.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

	@Value("${msg:Config Server is not Working}")
	private String msg;
	
	@GetMapping("/msg")
	public String getMsg()
	{
		return this.msg;
	}
}
