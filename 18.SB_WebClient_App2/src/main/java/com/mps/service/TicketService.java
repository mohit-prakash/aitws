package com.mps.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.mps.bindings.TicketResponse;

@Service
public class TicketService {

	public void getTicket()
	{
		System.out.println("SYN -- request sending");
		TicketResponse response=null;
		String url="https://irctc-railway-api.herokuapp.com/ticket/PNR2218";
		
		WebClient webClient=WebClient.create();
		response = webClient.get()
						.uri(url)
						.header("Accept", "application/json")
						.retrieve()
						.bodyToMono(TicketResponse.class)
						.block();
		System.out.println(response);
		//since It is a synchronous,Printing of Custom Logic will be delayed, because It will wait for response 
		System.out.println("Custom Logic........");
		System.out.println("------------------------------------------------");
	}
	
	public void getTicketAsync()
	{
		System.out.println("ASYN -- request sending");
		TicketResponse response=null;
		String url="https://irctc-railway-api.herokuapp.com/ticket/PNR2218";
		
		WebClient webClient=WebClient.create();
		webClient.get()
						.uri(url)
						.header("Accept", "application/json")
						.retrieve()
						.bodyToMono(TicketResponse.class)
						.subscribe(TicketService::handleResponse);
		//since It is a asynchronous,Printing of Custom Logic will be quick. Not wait for response	
		System.out.println("Custom Logic..........");
	}
	
	public static void handleResponse(TicketResponse response)
	{
		System.out.println("Response Handler Called........");
		System.out.println(response);
	}
}
