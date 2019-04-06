package com.mytrain.mytrain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytrain.mytrain.modal.Station;
import com.mytrain.mytrain.services.StationService;

@RestController
@RequestMapping("/Station")
public class StationController {

	@Autowired
	private StationService service;
	
	@GetMapping("/getAllStation")
	public List<Station> getAllStation(){
		return service.getAllStaion();
	}
	
	@GetMapping("/getStation")
	public Station getStation(@RequestParam String id) {
		return service.getStaion(id);
	}
	
	@GetMapping("/saveStation")
	public void saveStation(@ModelAttribute Station station) {
		service.saveStation(station);
	}
}
