package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketDetails {
	private String ticketId;
	private String status;
	private String pnr;
	private String from;
	private String to;
	private String name;
	private String jDate;
	private Double cost;
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getjDate() {
		return jDate;
	}
	public void setjDate(String jDate) {
		this.jDate = jDate;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "TicketDetails [ticketId=" + ticketId + ", status=" + status + ", pnr=" + pnr + ", from=" + from
				+ ", to=" + to + ", name=" + name + ", jDate=" + jDate + ", cost=" + cost + "]";
	}
	
}
