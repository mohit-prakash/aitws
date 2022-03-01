package com.mps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Car {

	@Autowired
	@Qualifier("petrol")
	private IEngine eng;
	
/*	@Autowired
	public Car(IEngine eng) {
		System.out.println("Constructor :: Car");
		this.eng=eng;
	}
	*/	
	public void drive(int i)
	{
		if(eng.start(i)==1)
		{
			System.out.println("Engine is starting!!");
			System.out.println("Journey Started!!");
		}
		else
			System.out.println("Something is Wrong!!");
	}
}
