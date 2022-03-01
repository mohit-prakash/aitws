package com.mps.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.binding.Invoice;

public class JsonToJava {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectMapper mapper=new ObjectMapper();

		Invoice i2 = mapper.readValue(new File("invoice.json"),Invoice.class);
		System.out.println(i2);
	}

}
