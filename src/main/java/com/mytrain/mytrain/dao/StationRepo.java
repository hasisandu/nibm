package com.mytrain.mytrain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mytrain.mytrain.modal.Station;

@Repository
public interface StationRepo extends CrudRepository<Station, String>{

}
