package com.mps.bindings;

import lombok.Data;

@Data
public class PassengerRequest {
	private String email;
	private String jdate;
	private String from;
	private String to;
	private String name;
	private Long phno;
	private String trainNum;
}
