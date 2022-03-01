package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

	@GetMapping("/price/{book}")
	public ResponseEntity<String> getPrice(@PathVariable("book") String bName)
	{
			String price="";
			if(bName.equals("Java"))
				price="Rs600.00";
			else if(bName.equals("Python"))
				price="Rs450.00";
			else
				price=null;
			
			if(price!=null)
				return new ResponseEntity<String>(bName+" book price is "+price,HttpStatus.OK);
			else
				return new ResponseEntity<String>("Not Available",HttpStatus.OK);
	}
	
}
