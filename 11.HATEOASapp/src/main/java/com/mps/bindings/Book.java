package com.mps.bindings;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book extends RepresentationModel<Book> {
	private Double bookPrice;
	private String bookName;
	private String bookIsbn;
	private String author;
}
