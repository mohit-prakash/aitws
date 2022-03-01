package com.mps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "PRODUCTS")
public class ProductEntity {
	@Id
	@Column(name = "PID")
	private Integer pid;
	
	@Column(name = "PNAME")
	private String name;
	
	@Column(name = "PPRICE")
	private Double price;
}
