package com.mps.converter;

import java.io.FileOutputStream;

import com.google.gson.Gson;
import com.mps.binding.Products;

public class JavaToJson {

	public static void main(String[] args) throws Exception{
		Products p1 = new Products();
		p1.setProductCost("Rs1000.00");
		p1.setProductId(101);
		p1.setProductName("Pen");
		
		Gson gson = new Gson();
		String s1=gson.toJson(p1);
		FileOutputStream fos=new FileOutputStream("products.json");
		fos.write(s1.getBytes());
		fos.close();
	}

}
