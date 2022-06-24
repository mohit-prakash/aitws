package com.mps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
