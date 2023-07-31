package com.verizon.csp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.Orderingmodel;
import com.verizon.csp.repo.Orderingrepo;
@RestController
@RequestMapping(value="/api/orderingmodel",method= {RequestMethod.GET,RequestMethod.POST})
public class Orderingcontroller {
	private Orderingrepo odrepo;
	 
	@Autowired
	public Orderingcontroller(Orderingrepo odrepo) 
	{
		
		this.odrepo=odrepo;
	}

	/*
	 * @RequestMapping("/allorder") public List<OrderModel> getAllOrderModel() {
	 * return orderservice.getAllOrderModel();
	 * 
	 * }
	 */ 
	  @GetMapping("/create") 
	  public String create(Orderingrepo odrepo) 
	  { return "order"; 
	  }
	  @PostMapping("/submit-order")
		public String save(Orderingmodel odmod)
		{ 
		  	this.odrepo.save(odmod);
			return "index";
		}
}