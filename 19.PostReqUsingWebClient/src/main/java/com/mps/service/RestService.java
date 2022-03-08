package com.mps.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.mps.request.PassengerRequest;
import com.mps.response.TicketResponse;

@Service
public class RestService {

	public void bookTicket()
	{
		PassengerRequest preq = new PassengerRequest();
		preq.setEmail("mps@gmail.com");
		preq.setFrom("Hyd");
		preq.setTo("Arq");
		preq.setJdate("27/11/22");
		preq.setName("Mohit");
		preq.setPhno(9199478775l);
		preq.setTrainNum("T123456");
		
		String url="https://irctc-railway-api.herokuapp.com/bookticket";
		
		WebClient client = WebClient.create();
		
		String response=client.post()
				.uri(url)
				.header("Content-Type","application/json")
				.bodyValue(preq)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println(response);
	}
	
	public void getTicket()
	{
		TicketResponse response=null;
		String url="https://irctc-railway-api.herokuapp.com/ticket/PNR8950";
		
		WebClient client=WebClient.create();
		response = client.get()
				.uri(url)
				.header("Accept", "application/json")
				.retrieve()
				.bodyToMono(TicketResponse.class)
				.block();
	
		System.out.println(response);
	}
}
