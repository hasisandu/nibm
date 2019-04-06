package com.mytrain.mytrain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mytrain.mytrain.modal.Booking;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Integer>{

}
