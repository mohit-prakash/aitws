package com.mps.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mps.bindings.Book;

@RestController
public class BookController {

	@GetMapping(value="/book/{isbn}",produces = {"application/json"})
	public ResponseEntity<Book> getBookByIsbn(@PathVariable String isbn)
	{
		Book b =new Book(250.00,"Spring Boot",isbn,"Chimpu");
		Link withRel=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getAllBooks()).withRel("All Books");
		b.add(withRel);
		return new ResponseEntity<Book>(b,HttpStatus.OK);
	}
	
	@GetMapping(value="/books",produces = {"application/json"})
	public ResponseEntity<List<Book>> getAllBooks()
	{
		Book b1 =new Book(350.00,"Spring Mvc","ISBN001","Mohit");
		Book b2 =new Book(200.75,"Spring Core","ISBN002","Pratik");
		Book b3 =new Book(4000.00,"Mongo DB","ISBN003","Suresh");
		Link withRel=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookByIsbn("ISBN007")).withRel("Book1");
		b1.add(withRel);
		List<Book> list=Arrays.asList(b1,b2,b3);
		return new ResponseEntity<List<Book>>(list,HttpStatus.OK);
	}
}
