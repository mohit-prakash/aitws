package com.mps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BOOKS")
public class BookEntity {
	@Id
	@Column(name="BOOK_ID")
	private Integer bookId;
	@Column(name="BOOK_NAME")
	private String bookName;
	@Column(name="BOOK_PRICE")
	private Double bookPrice;
}
