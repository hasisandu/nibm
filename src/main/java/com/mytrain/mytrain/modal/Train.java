package com.mytrain.mytrain.modal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Train {

	@Id
	private int trackid;

	private String trainname;

	private String classtype;

	private int seats;

	private Double lon;
	private Double lat;

	@OneToMany(mappedBy = "train")
	private List<Booking> booking = new ArrayList<Booking>();

	@OneToMany(mappedBy = "train")
	private List<TimeTable> timeTable = new ArrayList<TimeTable>();

	public Train(int trackid, String trainname, String classtype, int seats, List<Booking> booking, List<TimeTable> timeTable,Double lon, Double lat) {
		this.trackid = trackid;
		this.trainname = trainname;
		this.classtype = classtype;
		this.seats = seats;
		this.booking = booking;
		this.timeTable = timeTable;
		this.lon = lon;
		this.lat = lat;
	}

	public Train(int trackid, String trainname, String classtype, int seats, Double lon, Double lat) {
		this.trackid = trackid;
		this.trainname = trainname;
		this.classtype = classtype;
		this.seats = seats;
		this.lon = lon;
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Train() {
	}

	public int getTrackid() {
		return trackid;
	}

	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getClasstype() {
		return classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public List<TimeTable> getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(List<TimeTable> timeTable) {
		this.timeTable = timeTable;
	}
}
