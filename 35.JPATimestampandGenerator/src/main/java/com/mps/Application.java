package com.mps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mps.entity.Student;
import com.mps.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		Student s1 = new Student();
		s1.setSname("Ghanshyam");
		s1.setSrank(119l);
		s1.setSid(3); //when we manually set id (existed in db) then save(..) is updating the records not inserting
		studentRepository.save(s1);
		System.out.println("------------Done------------------");
	}

}
