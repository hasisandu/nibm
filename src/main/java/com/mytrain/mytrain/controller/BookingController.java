package com.mytrain.mytrain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytrain.mytrain.modal.Booking;
import com.mytrain.mytrain.services.BookingService;

@RestController
@RequestMapping("/Booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/getAllBooking")
	public List<Booking> getAllBooking(){
		return bookingService.getAllBooking();
	}
	
	@GetMapping("/getBooking")
	public Booking getBooking(@RequestParam Integer id) {
		return bookingService.getBooking(id);
	}
	
	@GetMapping("/saveBooking")
	public void saveBook(@ModelAttribute Booking booking) {
		bookingService.saveBooking(booking);
	}
}
