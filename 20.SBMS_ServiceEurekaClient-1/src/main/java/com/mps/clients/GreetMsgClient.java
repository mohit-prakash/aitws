package com.mps.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-SERVICE")
public interface GreetMsgClient {

	@GetMapping("/greet")
	public String getGreetMsg();
}
