package com.verizon.csp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.Customermodel;
import com.verizon.csp.repo.Customerrepo;
import com.verizon.csp.service.Customerservice;
@RestController
@RequestMapping(value="/api/customermodel",method= {RequestMethod.GET,RequestMethod.POST})
public class Customercontroller {
	private Customerrepo custrepo;
	@Autowired
	public Customercontroller(Customerservice custservice) {
		this.custrepo=custrepo;
	}
	//@RequestMapping("/allcustomer")
	//public List<Customermodel>getAllCustomermodels(){
		//return custservice.getAllCustomermodels();
@GetMapping("/create/customer")
public String create (Customermodel customermodel) {
	return "customer";
	}
	@PostMapping("/submit-customer")
	public String save(Customermodel customermodel)
	{	this.custrepo.save(customermodel);
		return "index";
	}
}