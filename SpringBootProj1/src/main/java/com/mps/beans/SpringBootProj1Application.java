package com.mps.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProj1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootProj1Application.class, args);
		Car car=ctx.getBean(Car.class);
		car.drive(8);
		System.out.println(ctx.getClass().getName());
	}

}
