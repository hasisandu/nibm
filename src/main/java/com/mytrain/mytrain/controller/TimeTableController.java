package com.mytrain.mytrain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytrain.mytrain.modal.TimeTable;
import com.mytrain.mytrain.services.TimeTableService;

@RestController
@RequestMapping("/TimeTable")
public class TimeTableController {

	@Autowired
	private TimeTableService service;
	
	@GetMapping("/getAllTimeTable")
	public List<TimeTable> getAllStation(){
		System.out.println("jj");
		return service.getAllStaion();
	}
	
	@GetMapping("/getTimeTable")
	public TimeTable getStation(@RequestParam Integer id) {
		return service.getStaion(id);
	}
	
	@GetMapping("/saveTimeTable")
	public void saveStation(@ModelAttribute TimeTable table) {
		service.saveStation(table);
	}
	
}
