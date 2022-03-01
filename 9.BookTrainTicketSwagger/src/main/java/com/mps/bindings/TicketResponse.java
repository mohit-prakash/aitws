package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TicketResponse {
	private String name;
	private String status;
	private String cost;
	private String from;
	private String to;
	private String jdate;
	private String pnr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
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
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", status=" + status + ", cost=" + cost + ", from=" + from + ", to="
				+ to + ", jdate=" + jdate + ", pnr=" + pnr + "]";
	}
	
}
