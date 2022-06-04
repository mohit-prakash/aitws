package com.mps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mps.Constants.AppConstants;
import com.mps.props.StoreDataFromYmlToBean;

@RestController
public class ReadDataController {
		
		@Autowired
		private StoreDataFromYmlToBean ymlData;
		
		@GetMapping("/welcome")
		public ResponseEntity<String> getWelcomeMsg()
		{
			String msg=ymlData.getProperties().get(AppConstants.WELCOME_MSG);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		
		@GetMapping("/greet")
		public ResponseEntity<String> getGreetMsg()
		{
			String msg=ymlData.getProperties().get(AppConstants.GREET_MSG);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		
		@GetMapping("/test")
		public ResponseEntity<String> getTestMsg()
		{
			String msg=ymlData.getProperties().get(AppConstants.TEST_MSG);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
}
