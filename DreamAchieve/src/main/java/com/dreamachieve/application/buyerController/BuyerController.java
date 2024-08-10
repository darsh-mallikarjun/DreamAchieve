package com.dreamachieve.application.buyerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dreamachieve.application.dao.BuyerDao;
import com.dreamachieve.application.model.Buyer;
import com.dreamachieve.application.service.BuyerService;

@Controller
@RequestMapping("/registartion")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;
	
	
	
	@GetMapping
	public String showregisterform(Model model) {
		Buyer buyer = new Buyer();
		model.addAttribute("user" , buyer);
		return "Registration" ;
	}	
	
	@PostMapping
	public String registration(@ModelAttribute("user") Buyer buyer ) {
	     buyerService.save(buyer);
	     return "redirect:/registartion?success" ;
	}
}
