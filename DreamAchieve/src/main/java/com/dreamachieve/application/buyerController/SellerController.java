package com.dreamachieve.application.buyerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dreamachieve.application.model.Seller;
import com.dreamachieve.application.service.SellerService;


@Controller
@RequestMapping("/sellerLogin")
public class SellerController {

	
	@Autowired
	private SellerService sellerservice;
	
	
	@GetMapping
	public String sellerregisterform(Model model) {
		Seller seller = new Seller();
		model.addAttribute("user" , seller);
		return "SellerRegistration" ;
	}	
	
	@PostMapping
	public String registration(@ModelAttribute("user") Seller seller) {
		sellerservice.save(seller);
	     return "redirect:/sellerLogin?success" ;
	}
}
