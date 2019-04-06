package com.mytrain.mytrain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrain.mytrain.dao.StationRepo;
import com.mytrain.mytrain.modal.Station;

@Service
public class StationService {
	
	@Autowired
	private StationRepo repo;
	
	public List<Station> getAllStaion(){
		List<Station> list= new ArrayList<Station>();
		for (Station station : repo.findAll()) {
			list.add(station);
		}
		return list;
	}
	
	public Station getStaion(String id) {
		return (Station)repo.findById(id).get();
	}
	
	public void saveStation(Station station) {
		repo.save(station);
	}

}
