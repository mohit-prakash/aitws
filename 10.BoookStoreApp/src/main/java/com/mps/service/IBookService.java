package com.mps.service;

import java.util.List;
import java.util.Optional;

import com.mps.entity.BookEntity;

public interface IBookService {
	
	public BookEntity addBook(BookEntity book);
	public List<BookEntity> addBooks(List<BookEntity> books);
	public List<BookEntity> showAllBooks();
	public Optional<BookEntity> showBookById(String bookId);
}
