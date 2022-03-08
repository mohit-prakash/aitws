package com.mps.request;

import lombok.Data;

@Data 
public class PassengerRequest {

	private String email;
	private String from;
	private String jdate;
	private String name;
	private Long phno;
	private String to;
	private String trainNum;
	
}
