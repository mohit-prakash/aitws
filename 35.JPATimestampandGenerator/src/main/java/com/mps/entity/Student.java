package com.mps.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="STUDENT_INFO")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private Integer sid;
	@Column(name="STUDENT_NAME")
	private String sname;
	@Column(name="STUDENT_RANK")
	private Long srank;
	@Column(name="CREATED_ON",updatable = false)
	@CreationTimestamp
	private LocalDateTime creationTime;
	@Column(name="UPDATED_ON",insertable = false)
	@UpdateTimestamp
	private LocalDateTime updationTime;
	
}
