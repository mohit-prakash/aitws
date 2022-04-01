package com.mps.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class GetDataController {
	
	@GetMapping("/data")
	@HystrixCommand(
			fallbackMethod = "getDataFromDB",
			commandProperties = {
					@HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="3"),
					@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value="10000"),
					@HystrixProperty(name="circuitBreaker.enabled", value="true")
			}
			
			)
	public String getDataFromRedis()
	{
		System.out.println("getting data from redis");
		if(new Random().nextInt(10)<=10)
		{
			throw new RuntimeException("Redis Server is Down!!");
		}
		//logic to access data from redis
		return "data accessed from redis";
	}
	
	public String getDataFromDB()
	{
		System.out.println("getting data from DB");
		//logic to access DB
		return "data accessed from DB";
	}
}
