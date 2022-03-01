package com.mps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.bindings.PassengerRequest;
import com.mps.bindings.TicketResponse;
import com.mps.service.IrctcService;

@RestController
public class IrctcRest {
	@Autowired
	private IrctcService service;

	@PostMapping(value = "/bookticket", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> saveTicket(@RequestBody PassengerRequest preq) {
		System.out.println("Ticket Saved in RestController!!");
		String pnr = service.saveTicket(preq);
		String msg = "Ticket booked successfully!! " + pnr;
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{pnr}", produces = { "application/xml", "application/json" })
	public ResponseEntity<TicketResponse> getTicket(@PathVariable String pnr) {
		return new ResponseEntity<TicketResponse>(service.getTicketByPnr(pnr), HttpStatus.OK);
	}

	@PutMapping(value = "/ticket/update", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> updateTicket(@RequestBody TicketResponse tr) {
		String msg = service.updateTicket(tr);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/ticket/{pnr}")
	public ResponseEntity<String> deleteTicket(@PathVariable String pnr) {
		return new ResponseEntity<String>(service.deleteTicket(pnr), HttpStatus.OK);
	}
}
