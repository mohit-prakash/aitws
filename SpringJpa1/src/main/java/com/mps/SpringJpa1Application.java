package com.mps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mps.entity.ProductEntity;
import com.mps.repository.ProductRepo;

@SpringBootApplication
public class SpringJpa1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx =
					SpringApplication.run(SpringJpa1Application.class, args);
		
		ProductRepo bean=ctx.getBean(ProductRepo.class);

		ProductEntity p1 = new ProductEntity();
		p1.setName("Parker Pen");
		p1.setPid(101);
		p1.setPrice(75.00);
		
		bean.save(p1);
		System.out.println("One record inserted Successfully!!");
	}

}
