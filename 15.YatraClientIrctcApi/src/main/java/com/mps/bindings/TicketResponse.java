package com.mps.bindings;

import lombok.Data;

@Data
public class TicketResponse {
	
	private Double cost;
	private String from;
	private String jdate;
	private String to;
	private String name;
	private String pnr;
	private String status;
	private Long ticketId;

}
