package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

	@GetMapping("/welcome")
	public ResponseEntity<String> getName(@RequestParam("name") String name)
	{
		String msg="Welcome "+name+" in Rest Course!!";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/book")
	public ResponseEntity<String> getPriceByBook(@RequestParam("bname") String name)
	{
			if(name.equals("Java"))
				return new ResponseEntity<String>("Rs560.00",HttpStatus.OK);
			else if(name.equals("Python"))
				return new ResponseEntity<String>("Rs400.00",HttpStatus.OK);
			else
				return new ResponseEntity<String>("Not Available",HttpStatus.OK);
	}
}
