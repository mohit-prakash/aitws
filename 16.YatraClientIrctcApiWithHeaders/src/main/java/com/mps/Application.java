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
		
//		To book Ticket uncomment this.... and Note PNR
//		String bookTicket = bean.bookTicket();
//		System.out.println("PNR is"+bookTicket);
		
//		To get Ticket ticket response use same PNR in url and uncomment below 
//		TicketResponse ticket = bean.getTicket();
//		System.out.println(ticket);
		
	}

}
