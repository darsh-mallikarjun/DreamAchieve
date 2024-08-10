package com.dreamachieve.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreamachieve.application.model.Buyer;


@Repository
public interface BuyerRepo extends JpaRepository<Buyer ,Integer> {
	

	public Buyer findByEmail(String email);

}
