package com.mytrain.mytrain.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mytrain.mytrain.modal.Passenger;

@Repository
public interface PassengerRepo extends CrudRepository<Passenger, Integer>{

    @Query("select email,password from Passenger p where p.email = ?1")
    String findByEmailAddress(String email);

}
