package com.mps.service;

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
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> postForEntity = rt.postForEntity(url, req, String.class);
		response=postForEntity.getBody();
		return response;
	}
	
	public TicketResponse getTicket()
	{
		TicketResponse response=null;
		String url="https://irctc-railway-api.herokuapp.com/ticket/PNR2716";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<TicketResponse> forEntity = rt.getForEntity(url, TicketResponse.class);
		response = forEntity.getBody();
		return response;
	}
	
}
