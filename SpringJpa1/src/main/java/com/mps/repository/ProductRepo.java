package com.mps.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.mps.entity.ProductEntity;

public interface ProductRepo extends CrudRepository<ProductEntity, Serializable>{

}
