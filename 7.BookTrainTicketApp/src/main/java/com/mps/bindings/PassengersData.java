package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PassengersData {
	private String name;
	private String email;
	private String phno;
	private String from;
	private String to;
	private String jDate;
	private String tNum;
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
	public String getjDate() {
		return jDate;
	}
	public void setjDate(String jDate) {
		this.jDate = jDate;
	}
	public String gettNum() {
		return tNum;
	}
	public void settNum(String tNum) {
		this.tNum = tNum;
	}
	@Override
	public String toString() {
		return "PassengersData [name=" + name + ", email=" + email + ", phno=" + phno + ", from=" + from + ", to=" + to
				+ ", jDate=" + jDate + ", tNum=" + tNum + "]";
	}
	
}
