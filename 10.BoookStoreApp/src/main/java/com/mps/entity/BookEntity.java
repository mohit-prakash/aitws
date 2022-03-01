package com.mps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Entity
@Table(name="Book")
@Data
@XmlRootElement
public class BookEntity {
	@Id
	@Column(name="Bid")
	private String bookId;
	
	@Column(name="Bname")
	private String bookName;
	
	@Column(name="Bprice")
	private Double bookPrice;
}
