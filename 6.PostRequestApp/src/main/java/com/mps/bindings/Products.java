package com.mps.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
public class Products {
	private Integer pPid;
	private String pName;
	private Double pPrice;
	public Integer getpPid() {
		return pPid;
	}
	public void setpPid(Integer pPid) {
		this.pPid = pPid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Products [pPid=" + pPid + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
}
