package com.mps;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mps.entity.PlayerEntity;
import com.mps.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);

		//To insert data into DB
		/*
		  PlayerEntity p1 = new PlayerEntity(); p1.setPlayerName("Sachin");
		  p1.setPlayerAge(40); p1.setPlayerid(101); p1.setPlayerCity("Mumbai");
		  p1.setPlayerGender("Male");
		  
		  playerRepository.save(p1); System.out.println("Inserted!!");
		 
		 */

		//To retrieve data from DB
		Optional<PlayerEntity> id = playerRepository.findById(101);
		if(id.isPresent())
			System.out.println(id.get());
		
	}

}
