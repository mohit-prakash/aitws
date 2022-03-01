package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class PassengerRequest {
	private String name;
	private String email;
	private String phno;
	private String from;
	private String to;
	private String jdate;
	private String tnum;	
}
