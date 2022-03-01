package com.mps.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mps.userdefinedexception.NoDataFoundException;

@RestController
public class WelcomeController {

	@GetMapping("/divide/{num1}/{num2}")
	public ResponseEntity<String> welcome(@PathVariable Integer num1, @PathVariable Integer num2)
	{
			Integer sum=num1/num2;
			String msg="Result :"+sum;
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/length/{msg}")
	public ResponseEntity<String> lengthMsg(@PathVariable String msg)
	{
		String str="length of message is "+msg.length();
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@GetMapping("/ticket/{pnr}")
	public ResponseEntity<String> getTicketByPnr(@PathVariable String pnr)
	{
		throw new NoDataFoundException("No ticket Found!!");
	}
}
