package com.mps;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mps.entity.BookEntity;
import com.mps.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		
		//List<BookEntity> allBooks = bookRepository.getAllBooksNative();
		List<BookEntity> allBooks = bookRepository.getAllBooksNative();
		allBooks.forEach(book -> {
			System.out.println(book);
		});
		
	}

}
