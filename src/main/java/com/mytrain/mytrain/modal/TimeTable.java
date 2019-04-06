package com.mytrain.mytrain.modal;

import java.util.Date;

import javax.persistence.*;

@Entity
public class TimeTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private String station;
	
	@Temporal(TemporalType.TIME)
	private Date time;
	
	@ManyToOne
	private Train train;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public String getStation() {
		return station;
	}




	public void setStation(String station) {
		this.station = station;
	}




	public Date getTime() {
		return time;
	}




	public void setTime(Date time) {
		this.time = time;
	}




	public Train getTrain() {
		return train;
	}




	public void setTrain(Train train) {
		this.train = train;
	}




	public TimeTable() {
		super();
	}




	public TimeTable(int id, Date date, String station, Date time, Train train) {
		super();
		this.id = id;
		this.date = date;
		this.station = station;
		this.time = time;
		this.train = train;
	}




	@Override
	public String toString() {
		return "TimeTable [id=" + id + ", date=" + date + ", station=" + station + ", time=" + time + ", train=" + train
				+ "]";
	}
	
	
}
