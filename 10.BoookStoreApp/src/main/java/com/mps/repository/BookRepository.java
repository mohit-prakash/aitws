package com.mps.repository;

import org.springframework.data.repository.CrudRepository;

import com.mps.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, String> {

}
