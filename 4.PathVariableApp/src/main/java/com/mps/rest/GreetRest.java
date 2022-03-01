package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRest {

@GetMapping("/interest/{p}/{r}/{t}")
public ResponseEntity<String> getInterestAmount(@PathVariable("p") Double principle, @PathVariable("r") Double rate, @PathVariable("t") Double time)
{
		Double interest=principle*rate*time*0.01;
		String msg="Interest will be "+interest;
		return new ResponseEntity<String>(msg,HttpStatus.OK);
}	
}
