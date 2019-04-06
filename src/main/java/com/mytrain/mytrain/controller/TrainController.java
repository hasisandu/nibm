package com.mytrain.mytrain.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.mytrain.mytrain.modal.Train;
import com.mytrain.mytrain.services.TrainService;

@RestController
@RequestMapping("/Train")
public class TrainController {

	@Autowired
	private TrainService service;
	
	@GetMapping("/getAllTrains")
	public List<Train> getAllTrain(){
		System.out.println("get");
		return service.getAllTrain();
	}
	
	@GetMapping("/getTrain")
	public Train getTrain(@RequestParam Integer id) {

		return service.getTrain(id);
	}

	@PostMapping("/saveTrain")
	@CrossOrigin(origins="*")
	public void saveTrain(@RequestBody String json) {
		System.out.println("ok");
		JSONObject jsonObject =new JSONObject(json);
		Train train=new Train(
				jsonObject.getInt("trackid"),
				jsonObject.getString("trainname"),
				jsonObject.getString("classtype"),
				jsonObject.getInt("seats"),
				jsonObject.getDouble("lon"),
				jsonObject.getDouble("lat")
		);
		service.saveTrain(train);
	}
}
