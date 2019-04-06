package com.mytrain.mytrain.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {

	@Id
	private Long priceId;
	
	private String fromStation;
	
	private String toStation;
	
	private Double cost;
	
	private String clastype;
	
	public Price() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", from=" + fromStation + ", to=" + toStation + ", cost=" + cost + ", clastype="
				+ clastype + "]";
	}

	public Price(Long priceId, String from, String to, Double cost, String clastype) {
		super();
		this.priceId = priceId;
		this.fromStation = from;
		this.toStation = to;
		this.cost = cost;
		this.clastype = clastype;
	}

	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public String getFrom() {
		return fromStation;
	}

	public void setFrom(String from) {
		this.fromStation = from;
	}

	public String getTo() {
		return toStation;
	}

	public void setTo(String to) {
		this.toStation = to;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getClastype() {
		return clastype;
	}

	public void setClastype(String clastype) {
		this.clastype = clastype;
	}
	
	
}
