package com.mps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

	public List<BookEntity> findByBookName(String name);
	
	public List<BookEntity> findByBookNameAndBookPrice(String name,Double price);
	
	public List<BookEntity> findByBookPriceGreaterThan(Double price);
		
}
