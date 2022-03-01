package com.mps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.bindings.PassengerRequest;
import com.mps.bindings.TicketResponse;
import com.mps.service.IrctcService;

@RestController
public class IrctcRestController {
	
	@Autowired
	private IrctcService iservice;
	
	@PostMapping(value="/bookticket",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> bookTicket(@RequestBody PassengerRequest preq)
	{
		String pnr=iservice.bookTicket(preq);
		String msg="Ticket booked Successfully!!. "+pnr;
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/ticket/{pnr}",produces = {"application/xml","application/json"})
	public ResponseEntity<TicketResponse> getTicket(@PathVariable String pnr)
	{
		TicketResponse tr=iservice.getTicketByPnr(pnr);
		return new ResponseEntity<>(tr,HttpStatus.OK);
	}
}
