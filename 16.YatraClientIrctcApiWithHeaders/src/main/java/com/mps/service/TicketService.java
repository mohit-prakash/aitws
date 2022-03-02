package com.mps.service;


import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mps.bindings.PassengerRequest;
import com.mps.bindings.TicketResponse;

@Service
public class TicketService {

	public String bookTicket()
	{
		String response=null;
		
		PassengerRequest req=new PassengerRequest();
		req.setEmail("pps@gmail.com");
		req.setFrom("Pune");
		req.setJdate("26/03/22");
		req.setName("Pratik");
		req.setPhno(9031602104l);
		req.setTo("Araria");
		req.setTrainNum("T1234");
		
		String url="https://irctc-railway-api.herokuapp.com/bookticket";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<PassengerRequest> reqEntity=new HttpEntity<PassengerRequest>(req,headers);
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> exchange = rt.exchange(url,HttpMethod.POST, reqEntity, String.class);
		response=exchange.getBody();
		return response;
	}
	
	public TicketResponse getTicket()
	{
		TicketResponse response=null;
		String url="https://irctc-railway-api.herokuapp.com/ticket/PNR3744";
		HttpHeaders headers=new HttpHeaders();
		headers.add("Accept","application/json");
		
		HttpEntity<TicketResponse> resEntity=new HttpEntity<TicketResponse>(headers);
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<TicketResponse> exchange = rt.exchange(url, HttpMethod.GET, resEntity, TicketResponse.class);
		response=exchange.getBody();
		return response;
	}
	
}
