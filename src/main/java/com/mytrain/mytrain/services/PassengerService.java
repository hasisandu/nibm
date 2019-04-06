package com.mytrain.mytrain.services;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrain.mytrain.dao.PassengerRepo;
import com.mytrain.mytrain.modal.Passenger;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepo passengerRepo;
	
	public List<Passenger> getAllPassenger(){
		List<Passenger> list = new ArrayList<Passenger>();
		for (Passenger passenger : passengerRepo.findAll()) {
			list.add(passenger);
		}
		return list;
	}
	
	public String getPassenger(String email) {
		String  passenger =passengerRepo.findByEmailAddress(email);
		return passenger;
	}
	
	public void savePassenger(Passenger p) {


		passengerRepo.save(p);
	}
}
