package com.mytrain.mytrain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mytrain.mytrain.modal.Train;

@Repository
public interface TrainRepo extends CrudRepository<Train, Integer>{

}
