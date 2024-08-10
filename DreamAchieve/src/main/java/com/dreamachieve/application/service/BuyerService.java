package com.dreamachieve.application.service;

import com.dreamachieve.application.dao.BuyerDao;
import com.dreamachieve.application.model.Buyer;


public interface BuyerService {

	
	
	Buyer findByEmail(String email , String password);
	
	
	
	Buyer save(Buyer buyer);

}
