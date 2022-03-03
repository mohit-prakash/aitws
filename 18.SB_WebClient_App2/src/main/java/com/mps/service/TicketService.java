package com.mps.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.mps.bindings.TicketResponse;

@Service
public class TicketService {

	public TicketResponse getTicket()
	{
		TicketResponse response=null;
		String url="https://irctc-railway-api.herokuapp.com/ticket/PNR7043";
		
		WebClient webClient=WebClient.create();
		response = webClient.get()
						.uri(url)
						.header("Accept", "application/json")
						.retrieve()
						.bodyToMono(TicketResponse.class)
						.block();
		
//		Custom Logic ..... will execute only after getting response
		
		return response;
	}
}
