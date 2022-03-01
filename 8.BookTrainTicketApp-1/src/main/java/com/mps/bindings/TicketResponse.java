package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class TicketResponse {
	private String name;
	private String status;
	private String cost;
	private String from;
	private String to;
	private String jdate;
	private String pnr;	
}
