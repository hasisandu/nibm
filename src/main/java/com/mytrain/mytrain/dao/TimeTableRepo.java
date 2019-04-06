package com.mytrain.mytrain.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mytrain.mytrain.modal.TimeTable;

@Repository
public interface TimeTableRepo extends CrudRepository<TimeTable, Integer>{


}
