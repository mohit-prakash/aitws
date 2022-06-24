package com.mps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mps.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		
		//1. Insert Multiple records by using saveAll(...) method
	/*	BookEntity b1 = new BookEntity(101,"Spring",150.00);
		BookEntity b2 = new BookEntity(102,"Java",170.54);
		BookEntity b3 = new BookEntity(103,"Angular",160.60);
		
		bookRepository.saveAll(Arrays.asList(b1,b2,b3)); */
		
		//2. Update record by using save() method (updated bcoz same id exist in db)
	/*	BookEntity b4 = new BookEntity(101,"SpringBoot",300.00);
		bookRepository.save(b4); */
		
		//3. retrieve all records by findAll() method
	/*	Iterable<BookEntity> findAll = bookRepository.findAll();
		for (BookEntity bookEntity : findAll) {
			System.out.println(bookEntity);
		}
		// both ways of for each
		findAll.forEach(b -> {
			System.out.println(b);
		}); */
		
		//4. retrieve multiple record by multiple ids
	/*	Iterable<BookEntity> findAllById = bookRepository.findAllById(Arrays.asList(102,103));
		findAllById.forEach(b -> {
			System.out.println(b);
		}); */
		
		//5. deleteByID
	/*	bookRepository.deleteById(101);
		System.out.println("Deletion done!!"); */
		
		//6. existsById(id)
	/*	boolean existsById = bookRepository.existsById(102);
		System.out.println(existsById); */
		
		//7. count()
	/*	long count = bookRepository.count();
		System.out.println(count); */
	} 

}
