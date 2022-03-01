package com.mps.beans;

import org.springframework.stereotype.Controller;

@Controller("petrol")
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("Constructor :: PetrolEngine");
	}

	@Override
	public int start(int i) {
		if(i>10)
			return 1;
		else
			return 0;
	}

}
