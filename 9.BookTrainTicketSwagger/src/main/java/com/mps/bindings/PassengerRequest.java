package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PassengerRequest {
	private String name;
	private String email;
	private String phno;
	private String from;
	private String to;
	private String jdate;
	private String tnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
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
	public String getTnum() {
		return tnum;
	}
	public void setTnum(String tnum) {
		this.tnum = tnum;
	}
	@Override
	public String toString() {
		return "PassengerRequest [name=" + name + ", email=" + email + ", phno=" + phno + ", from=" + from + ", to="
				+ to + ", jdate=" + jdate + ", tnum=" + tnum + "]";
	}
	
}
