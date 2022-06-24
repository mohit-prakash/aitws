package com.mps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
