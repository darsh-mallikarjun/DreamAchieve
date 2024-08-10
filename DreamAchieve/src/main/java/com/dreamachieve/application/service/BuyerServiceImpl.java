package com.dreamachieve.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamachieve.application.dao.BuyerDao;
import com.dreamachieve.application.model.Buyer;
import com.dreamachieve.application.repository.BuyerRepo;


@Service
public class BuyerServiceImpl  implements BuyerService{
	
	
	@Autowired
	private BuyerRepo buyerRepo;

	

	@Override
	public Buyer save(Buyer buyer) {
		return buyerRepo.save(buyer) ;
	}



	@Override
	public Buyer findByEmail(String email , String password) {
		Buyer buyer =buyerRepo.findByEmail(email);
		if(buyer !=null && buyer.getPassword().equals(password));
		return buyer;
	}

}
