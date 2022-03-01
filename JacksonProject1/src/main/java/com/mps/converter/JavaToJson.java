package com.mps.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.binding.Invoice;

public class JavaToJson {

	public static void main(String[] args) throws Exception{
			
		Invoice i1=new Invoice();
		i1.setInvoiceId("I101");
		i1.setCustomerMail("abcd@gmail.com");
		i1.setCustomerName("Abcd Kumar");
		i1.setCustomerPhn("9090766554");
		i1.setPaidAmt("Rs7000.00");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("invoice.json"), i1);

	}

}
