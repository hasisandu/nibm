package com.mytrain.mytrain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytrain.mytrain.modal.Price;
import com.mytrain.mytrain.services.PriceService;

@RestController
@RequestMapping("/Price")
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@GetMapping("/getAllPrice")
	public List<Price> getAllpriceService(){
		return priceService.getAllPrice();
	}

	@GetMapping("/getPrice")
	public Price getPrice(@RequestParam Long priceid) {
		return priceService.getPrice(priceid);
	}
	
	@GetMapping("/savePrice")
	public void savePrice(@ModelAttribute Price price) {
		priceService.savePrice(price);
	}
	
}
