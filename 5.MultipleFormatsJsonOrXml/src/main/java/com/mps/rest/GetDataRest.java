package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mps.bindings.Book;

@RestController
public class GetDataRest {

	@GetMapping(value="/book" , produces = {
								MediaType.APPLICATION_JSON_VALUE,
								MediaType.APPLICATION_XML_VALUE } 
	)
	public ResponseEntity<Book> getData()
	{
		Book book = new Book(101,"Java",550.00);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
}
