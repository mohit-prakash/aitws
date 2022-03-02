package com.mps.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.Disposable;

@Service
public class TicketService {

	public void getTicket()
	{
		String endpointUrl="https://irctc-railway-api.herokuapp.com/ticket/PNR3744";
		
		//WebClient is an interface, to get Object of WebClient we have create() method.
		WebClient webClient=WebClient.create();
		
	/*	Disposable disposable = webClient.get() //want to send get request
						.uri(endpointUrl) //which url to send get request
						.retrieve()  //to retrieve the response after sending request
						.bodyToMono(String.class)  //bind the response to String variable and Mono means we are getting single response from Rest API.
						.subscribe();  //to make request asynchronous. block() is used to make request synchronous.
		
		boolean disposed = disposable.isDisposed();
		
		System.out.println("Disposed "+disposed);
	*/
		String block = webClient.get()
						.uri(endpointUrl)
						.retrieve()
						.bodyToMono(String.class)
						.block();
		
		System.out.println(block);
	}
	
}
