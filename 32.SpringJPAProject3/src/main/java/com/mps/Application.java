package com.mps;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.mps.entity.BookEntity;
import com.mps.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		
		//1. insert records to perform sorting and pagination and QBE
	/*	BookEntity b1 = new BookEntity(101,"Spring",150.00);
		BookEntity b2 = new BookEntity(104,"Junit",170.50);
		BookEntity b3 = new BookEntity(105,"AWS",195.60);
		BookEntity b4 = new BookEntity(106,"Hadoop",350.00);
		BookEntity b5 = new BookEntity(107,"Oracle",200.90);
		BookEntity b6 = new BookEntity(108,"DBMS",560.00);
		
		bookRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6)); */
		
		//2. Pagination
	/*	int pageNum=0,pageSize=3;
		PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
		Page<BookEntity> findAll = bookRepository.findAll(pageRequest);
		findAll.forEach(b->{
			System.out.println(b);
		}); */
		
		//3. Sort based on single condition
	/*	List<BookEntity> list = bookRepository.findAll(Sort.by("bookName"));
		list.forEach(b->{
			System.out.println(b);
		}); */
		
		//4. Sort based on multiple conditions
	/*	List<BookEntity> list = bookRepository.findAll(Sort.by("bookName","bookPrice"));
		list.forEach(b->{
			System.out.println(b);
		}); */
		
		//5. Sorting and pagination simultaenously
	/*	int pageNum=0,pageSize=3;
		PageRequest pageRequest = PageRequest.of(pageNum, pageSize,Sort.by("bookName"));
		Page<BookEntity> findAll = bookRepository.findAll(pageRequest);
		findAll.forEach(b->{
			System.out.println(b);
		});  */
		
		//QueryByExample - retrieve data based on conditions
	/*	BookEntity bookEntity = new BookEntity();
		bookEntity.setBookName("Spring"); //filter1
		bookEntity.setBookPrice(150.00);//filter2
		Example<BookEntity> example = Example.of(bookEntity);
		List<BookEntity> findAll = bookRepository.findAll(example);
		findAll.forEach(b->{
			System.out.println(b);
		}); */
		
	}

}
