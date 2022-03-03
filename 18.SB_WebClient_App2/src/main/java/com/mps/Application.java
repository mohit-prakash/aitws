package com.mps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mps.bindings.TicketResponse;
import com.mps.service.TicketService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		TicketService bean = context.getBean(TicketService.class);
		bean.getTicket();
		bean.getTicketAsync();
	}

}
