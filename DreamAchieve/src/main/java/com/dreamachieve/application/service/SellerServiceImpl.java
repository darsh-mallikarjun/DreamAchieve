package com.dreamachieve.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamachieve.application.model.Seller;
import com.dreamachieve.application.repository.SellerRepo;


@Service
public class SellerServiceImpl implements SellerService {
	
	
	@Autowired
	private SellerRepo sellerRepo;

	public SellerServiceImpl(SellerRepo sellerRepo) {
		super();
		this.sellerRepo = sellerRepo;
	}


	

	@Override
	public List<Seller> findByAddress(String address) {
		// TODO Auto-generated method stub
		return sellerRepo.findByAddress(address) ;
	}


	@Override
	public List<Seller> findAll() {
		return sellerRepo.findAll();
		
	}




	@Override
	public Seller save(Seller Seller) {
		return sellerRepo.save(Seller);
	}




	@Override
	public Seller findSellerById(int theId) {
		Optional<Seller> result = sellerRepo.findById(theId);

		Seller product = null;

	        if (result.isPresent()) {
	        	product = result.get();
	        }
	        else {
	            // we didn't find the employee
	            throw new RuntimeException("Did not find Product id - " + theId);
	        }

	        return product;
	}
	
	}

