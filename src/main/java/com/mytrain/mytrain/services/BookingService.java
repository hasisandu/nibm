package com.mytrain.mytrain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrain.mytrain.dao.BookingRepo;
import com.mytrain.mytrain.modal.Booking;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepo bookingRepo;
	
	public List<Booking> getAllBooking() {
		List<Booking> list= new ArrayList<Booking>();
		
		for (Booking booking : bookingRepo.findAll()) {
			list.add(booking);
		}
		return list;
	}
	
	public Booking getBooking(Integer id) {
		return (Booking)bookingRepo.findById(id).get();
	}
	
	public void saveBooking(Booking booking) {
		bookingRepo.save(booking);
	}
	
	public void updateBooking(Booking booking) {
		bookingRepo.save(booking);
	}
	
	public void deleteBooking(Integer id) {
		bookingRepo.deleteById(id);
	}
}
