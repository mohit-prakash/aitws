package com.mps.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller("diesel")
@Primary
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("Constructor :: DieselEngine");
	}

	@Override
	public int start(int i) {
		if(i>0)
			return 1;
		else
			return 0;
	}

}
