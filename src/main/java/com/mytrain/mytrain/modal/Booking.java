package com.mytrain.mytrain.modal;

import javax.persistence.*;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	
	private String fromStation;
	
	private String toStation;
	
	private Double total;
	
	private Integer ticketcount;
	
	private String payId;

	
	@ManyToOne
	private Train train;

	public Booking(int bookid, String from, String to, Double total, Integer ticketcount, String payId,
			Passenger passenger, Train train) {
		super();
		this.bookid = bookid;
		this.fromStation = from;
		this.toStation = to;
		this.total = total;
		this.ticketcount = ticketcount;
		this.payId = payId;
		this.train = train;
	}
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
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

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getTicketcount() {
		return ticketcount;
	}

	public void setTicketcount(Integer ticketcount) {
		this.ticketcount = ticketcount;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}


	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	@Override
	public String toString() {
		return "Booking [bookid=" + bookid + ", from=" + fromStation + ", to=" + toStation + ", total=" + total + ", ticketcount="
				+ ticketcount + ", payId=" + payId +  ", train=" + train + "]";
	}
	
	
}
