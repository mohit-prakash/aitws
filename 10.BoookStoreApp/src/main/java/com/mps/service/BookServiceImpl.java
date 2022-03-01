package com.mps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.entity.BookEntity;
import com.mps.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public BookEntity addBook(BookEntity book) {
		return bookRepository.save(book);
	}

	@Override
	public List<BookEntity> addBooks(List<BookEntity> books) {
		return (List<BookEntity>)bookRepository.saveAll(books);
	}

	@Override
	public List<BookEntity> showAllBooks() {
		return (List<BookEntity>)bookRepository.findAll();
	}

	@Override
	public Optional<BookEntity> showBookById(String bookId) {
		return bookRepository.findById(bookId);
	}

}
