package com.dreamachieve.application.buyerController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dreamachieve.application.dao.SellerDao;
import com.dreamachieve.application.model.Seller;
import com.dreamachieve.application.service.SellerService;


@Controller
@RequestMapping
public class HomePageController {

	
	@Autowired
	private SellerService sellerService;
	
	
	@GetMapping("/welcome")
	public String HomePage(SellerDao sellerdao ,  Model model) {
		List<Seller> sellerAddress =sellerService.findByAddress(sellerdao.getAddress());
		model.addAttribute("product", sellerService.findAll());
		model.addAttribute("search",  new SellerDao());
		model.addAttribute("add", sellerAddress);
		return "WelcomePage";
		
	}
	
	
}
