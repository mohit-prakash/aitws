package com.mps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.entity.BookEntity;
import com.mps.service.IBookService;

@RestController
public class BookRestController {

	@Autowired
	private IBookService service;
	
	@PostMapping(value="/addbook",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody BookEntity book)
	{
		if(service.addBook(book)!=null)
			return new ResponseEntity<String>("Book saved Successfully!!",HttpStatus.CREATED);
		return new ResponseEntity<String>("Something is wrong!!",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value="/showbook/{id}", produces = {"application/xml","application/json"})
	public ResponseEntity<Optional<BookEntity>> showBookById(@PathVariable String id)
	{
		return new ResponseEntity<Optional<BookEntity>>(service.showBookById(id),HttpStatus.OK); 
	}
	
	@GetMapping(value="/showbooks", produces = {"application/xml","application/json"})
	public ResponseEntity<List<BookEntity>> showAllBooks()
	{
		return new ResponseEntity<List<BookEntity>>(service.showAllBooks(),HttpStatus.OK); 
	}

	@PostMapping(value="/addbooks",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> addBooks(@RequestBody List<BookEntity> books)
	{
		if(service.addBooks(books)!=null)
			return new ResponseEntity<String>("Books saved Successfully!!",HttpStatus.CREATED);
		return new ResponseEntity<String>("Something is wrong!!",HttpStatus.BAD_REQUEST);
	}
	
}
