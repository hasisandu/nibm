package com.mytrain.mytrain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrain.mytrain.dao.TimeTableRepo;
import com.mytrain.mytrain.modal.Station;
import com.mytrain.mytrain.modal.TimeTable;

@Service
public class TimeTableService {
	
	@Autowired
	private TimeTableRepo repo;
	
	public List<TimeTable> getAllStaion(){
		List<TimeTable> list= new ArrayList<TimeTable>();
		for (TimeTable station : repo.findAll()) {
			list.add(station);
		}
		return list;
	}
	
	public TimeTable getStaion(Integer id) {
		return (TimeTable)repo.findById(id).get();
	}
	
	public void saveStation(TimeTable timeTable) {
		repo.save(timeTable);
	}
}
