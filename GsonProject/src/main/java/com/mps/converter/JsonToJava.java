package com.mps.converter;

import java.io.FileInputStream;

import com.google.gson.Gson;
import com.mps.binding.Products;

public class JsonToJava {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("products.json"); 
		byte[] b=new byte[fis.available()];
		fis.read(b);
		String s=new String(b);
		
		fis.close();
		
		Gson gson = new  Gson();
		Products p2 = gson.fromJson(s, Products.class);
		System.out.println(p2);

	}

}
