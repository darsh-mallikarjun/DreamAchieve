package com.dreamachieve.application.service;

import java.util.List;

import com.dreamachieve.application.model.Seller;



public interface SellerService {
	

public List<Seller> findByAddress(String address) ;
	
	public List<Seller>findAll();
	
	public Seller findSellerById(int theId);
			
	Seller save(Seller Seller);

}
