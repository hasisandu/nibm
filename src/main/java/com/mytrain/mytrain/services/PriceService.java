package com.mytrain.mytrain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrain.mytrain.dao.PriceRepo;
import com.mytrain.mytrain.modal.Price;

@Service
public class PriceService {
	
	@Autowired
	private PriceRepo priceRepo;

	public List<Price> getAllPrice(){
		List<Price> list= new ArrayList<Price>();
		for (Price price : priceRepo.findAll()) {
			list.add(price);			
		}
		return list;
	}
	
	public Price getPrice(Long id) {
		return (Price)priceRepo.findById(id).get();
	}
	
	public void savePrice(Price price) {
		priceRepo.save(price);
	}
}
