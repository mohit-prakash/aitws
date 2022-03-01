package com.mps.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.bindings.PassengersData;
import com.mps.bindings.TicketDetails;

@RestController
public class AddPassengersRest {
	
	List<PassengersData> pList=new ArrayList<>();
	List<TicketDetails> tDetails=new ArrayList<>();
	Random r=new Random(2000l);
	@PostMapping(value="/bookticket" 
				,consumes={"application/xml" , "application/json"}
			)
	public ResponseEntity<String> addPassenger(@RequestBody PassengersData p)
	{
		pList.add(p);
		System.out.println(p);
	    TicketDetails td=new TicketDetails();
	    td.setFrom(p.getFrom());
	    td.setjDate(p.getjDate());
	    td.setName(p.getName());
	    td.setTo(p.getTo());
	    td.setCost(r.nextDouble());
	    td.setPnr("pnr"+r.nextInt(10));
	    td.setStatus("Confirmed");
	    td.setTicketId("TK"+r.nextInt(100));
	    System.out.println("PNR: "+td.getPnr());
	    tDetails.add(td);
	    System.out.println(td);
		return new ResponseEntity<String>("Ticket booked Successfully!!",HttpStatus.CREATED);
	}
	
	@GetMapping(value="/ticket/{pnr}",produces={"application/xml" , "application/json"})
	public ResponseEntity<TicketDetails> showTickets(@PathVariable String pnr)
	{
		TicketDetails td=null;
		Iterator<TicketDetails> it=tDetails.iterator();
		while(it.hasNext())
		{
			td=it.next();
			if(pnr.equals(td.getPnr()))
			{
				break;
			}
		}
		return new ResponseEntity<>(td,HttpStatus.OK);
	}
 }
