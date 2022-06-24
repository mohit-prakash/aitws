package com.mps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mps.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

	@Query("from BookEntity")
	public List<BookEntity> getAllBooks();
	
	@Query(value="SELECT * FROM BOOKS",nativeQuery = true)
	public List<BookEntity> getAllBooksNative();
}
