package com.mytrain.mytrain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mytrain.mytrain.modal.Price;

@Repository
public interface PriceRepo extends CrudRepository<Price, Long>{

}
