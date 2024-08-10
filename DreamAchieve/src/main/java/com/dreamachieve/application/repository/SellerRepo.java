package com.dreamachieve.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dreamachieve.application.model.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller ,Integer> {
	
	List<Seller> findByAddress(String address);

}
