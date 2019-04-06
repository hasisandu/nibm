package com.mytrain.mytrain.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Station {

	@Id
	private String trackid;
	
	private String name;
	
	public Station() {
		// TODO Auto-generated constructor stub
	}

	public Station(String trackid, String name) {
		super();
		this.trackid = trackid;
		this.name = name;
	}

	public String getTrackid() {
		return trackid;
	}

	public void setTrackid(String trackid) {
		this.trackid = trackid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Station [trackid=" + trackid + ", name=" + name + "]";
	}
	
	
}
