package com.verizon.csp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.EnterpriseCustmodel;
import com.verizon.csp.repo.EnterpriseCustomerrepo;
@RestController
@RequestMapping(value="/api/enterprisecustomermodel",method= {RequestMethod.GET,RequestMethod.POST})
public class EnterpriseCustomerController {
	private EnterpriseCustomerrepo enterprisecustrepo;
	@Autowired
	public EnterpriseCustomerController(EnterpriseCustomerrepo enterprisecustrepo) {
		this.enterprisecustrepo=enterprisecustrepo;
	}
	//@RequestMapping("/allenterprisecustomer")
	//public List<EnterpriseCustmodel>getAllEnterpriseCustomermodels(){
		//return enterprisecustservice.getAllEnterpriseCustomermodels();
@GetMapping("/createECCustomer")
public String create(EnterpriseCustmodel enterprisecustomermodel)
{
	return "enterprisecust";
}
@PostMapping("/submit-enterprise-customer")
public String save(EnterpriseCustmodel enterprisecustomermodel)
{
	this.enterprisecustrepo.save(enterprisecustomermodel);
	return "index";
}
}