package com.mytrain.mytrain.modal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Pid;

	private String email;
	
	private String firstname;
	
	private String lastname;
	
	@Column(nullable=true, length=20)
	private String contact;
	
	@Column(nullable=true, length=20)
	private String city;
	
	
	private String password;


	public Passenger(String email, String firstname, String lastname, String contact, String city, String password) {
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.city = city;
		this.password = password;
	}

	public Passenger(String email, String firstname, String lastname, String contact, String city, String password, List<Booking> booking) {
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.city = city;
		this.password = password;
	}

	public Passenger() {
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Passenger{" +
				"Pid=" + Pid +
				", email='" + email + '\'' +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", contact='" + contact + '\'' +
				", city='" + city + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
