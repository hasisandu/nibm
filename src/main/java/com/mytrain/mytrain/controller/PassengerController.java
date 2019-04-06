package com.mytrain.mytrain.controller;

import java.util.List;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mytrain.mytrain.modal.Passenger;
import com.mytrain.mytrain.services.PassengerService;

@RestController
@RequestMapping("/Passenger")
public class PassengerController {

	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/getAllPassenger")
	@CrossOrigin(origins="*")
	public List<Passenger> getAllPassenger(){
		System.out.println("ok");
		return passengerService.getAllPassenger();
	}
	
	@GetMapping("/getPassenger")
	@CrossOrigin(origins="*")
	public Passenger getPassenger(@RequestParam String email) {
		String  p=passengerService.getPassenger(email);
		String arr[] = new String[2];
		arr=p.split(",");
		Passenger pass= new Passenger();
		pass.setEmail(arr[0]);
		pass.setPassword(arr[1]);
		return pass;

	}
	
	@PostMapping("/savePasenger")
	@CrossOrigin(origins="*")
	public String savePassenger(@RequestBody String json) {
		System.out.println("ok");
		JSONObject jsonObject =new JSONObject(json);

		Passenger passenger=new Passenger(
				jsonObject.getString("firstname"),
				jsonObject.getString("lastname"),
				jsonObject.getString("contact"),
				jsonObject.getString("city"),
				jsonObject.getString("email"),
				jsonObject.getString("password")
				);
		passengerService.savePassenger(passenger);

		return "success";

	}
}
