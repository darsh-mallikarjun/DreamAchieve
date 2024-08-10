package com.dreamachieve.application.buyerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamachieve.application.dao.SellerDao;
import com.dreamachieve.application.model.Buyer;
import com.dreamachieve.application.model.Seller;
import com.dreamachieve.application.service.BuyerService;
import com.dreamachieve.application.service.SellerService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping
public class LoginController {

	@Autowired
	private BuyerService buyerService;
	
	@Autowired
	private SellerService sellerservice;
	
	@GetMapping("/login")
	public String loginpage(){
		return "Login";
	}
		
	@PostMapping("/logout")
	public String showloginpage(Buyer buyer , HttpSession HttpSession ,Model model ) {
		Buyer Buyer = buyerService.findByEmail(buyer.getEmail(),buyer.getPassword() );
		if(Buyer != null) {
			HttpSession.setAttribute("user", Buyer);
		}
		return "redirect:/buyerlogin";
	}
	
	
	@GetMapping("/buyerlogin")
	public String Products( SellerDao sellerDao ,Model model ,HttpSession HttpSession  ) {
		Buyer Buyer =(Buyer) HttpSession.getAttribute("user");  
          	List<Seller> products = sellerservice.findAll();
      	List<Seller> product1 =sellerservice.findByAddress( sellerDao.getAddress());
		if(Buyer != null) {
			
		HttpSession.setAttribute("product", products);
		model.addAttribute("name", Buyer.getName());
		model.addAttribute("add", product1);
		model.addAttribute("search",  new SellerDao());
		model.addAttribute("product", products );
	}
		return "BuyerWelcome";	
	}
	
	
	@GetMapping("/ViewDetails")
	public String ViewDetials(@RequestParam("sellid") int theId ,SellerDao sellerDao ,Model model ,HttpSession HttpSession ) {
		Buyer Buyer =(Buyer) HttpSession.getAttribute("user");  
      	List<Seller> products = sellerservice.findAll();
  	List<Seller> product1 =sellerservice.findByAddress( sellerDao.getAddress());
	if(Buyer != null) {
		Seller sellid = sellerservice.findSellerById(theId);
		model.addAttribute("sellid", sellid);
	HttpSession.setAttribute("product", products);
	model.addAttribute("name", Buyer.getName());
	model.addAttribute("add", product1);
	model.addAttribute("search",  new SellerDao());
	model.addAttribute("product", products );
}
	return "ViewDetails";	
	}
	
	  @GetMapping("/bookingDetails")	
			public String showBooking(@RequestParam("product") int theId,Model model, HttpSession httpSession ) {
			
		  Buyer Buyer =(Buyer) httpSession.getAttribute("user");
			if(Buyer != null) {
				
				model.addAttribute("user", Buyer);
				Seller sellid = sellerservice.findSellerById(theId);
				model.addAttribute("product", sellid);
			}
			return "booking-details";
		}
	
	
}
