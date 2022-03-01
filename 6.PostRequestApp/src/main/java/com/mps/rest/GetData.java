package com.mps.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.bindings.Products;

@RestController
public class GetData {
	
	@PostMapping(value="/product"
			,consumes= {MediaType.APPLICATION_JSON_VALUE , 
					MediaType.APPLICATION_XML_VALUE }
			)
	public ResponseEntity<String> getData(@RequestBody Products product)
	{
		String msg=null;
		System.out.println(product);
		msg="Product Inserted Successfully!!";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
}
/*

<Products>
<pPid>1001</pPid>
<pName>"Books"</pName>
<pPrice>550.00</pPrice>
</Products> 

 */
