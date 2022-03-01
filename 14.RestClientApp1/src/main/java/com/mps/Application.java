package com.mps;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mps.bindings.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//Endpoint URL
		String url="https://h2database.herokuapp.com/products";
		
		RestTemplate rt= new RestTemplate();
		ResponseEntity<Product[]> prds=rt.getForEntity(url, Product[].class);
		Product []products=prds.getBody();
		for(Product p : products)
		{
			System.out.println(p);
		}
		
	}

}
