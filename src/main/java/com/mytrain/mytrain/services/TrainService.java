package com.mytrain.mytrain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrain.mytrain.dao.TrainRepo;
import com.mytrain.mytrain.modal.Train;

@Service
public class TrainService {

	@Autowired
	private TrainRepo repo;
	
	public List<Train> getAllTrain(){
		List<Train>list= new ArrayList<Train>();
		for (Train train : repo.findAll()) {
			list.add(train);
		}
		return list;
	}
	
	public Train getTrain(Integer id) {
		return (Train)repo.findById(id).get();
	}
	
	public void saveTrain(Train train) {
		repo.save(train);
	}
}
