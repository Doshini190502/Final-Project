package com.verizon.csp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.Customermodel;
import com.verizon.csp.service.Customerservice;
@RestController
@RequestMapping("/api/customermodel")
public class Customercontroller {
	private Customerservice custservice;
	@Autowired
	public Customercontroller(Customerservice custservice) {
		this.custservice=custservice;
	}
	@RequestMapping("/allcustomermodel")
	public List<Customermodel>getAllCustomermodels(){
		return custservice.getAllCustomermodels();
	}
	@PostMapping("/insertcustomermodel")
	public Customermodel createCustomermodel(@RequestBody Customermodel customermodel) {
		return custservice.createCustomermodel(customermodel);
	}
	@PostMapping("/updatecustomermodel")
	public Customermodel updateCustomermodel(int order_id,Customermodel customermodel) {
		Customermodel existingCustomermodel=custservice.updateCustomermodel(order_id,customermodel);
		if(existingCustomermodel!=null) {
			existingCustomermodel.setCust_name(customermodel.getCust_name());
			existingCustomermodel.setCust_id(customermodel.getCust_id());
			return custservice.createCustomermodel(existingCustomermodel);
		}
		return null;
	}
	@DeleteMapping("/deletecustservice")
	public void deleteCustomermodel(Integer order_id){
		custservice.deleteCustomermodel(order_id);
	}
	@GetMapping("/all")
	public Customermodel getCustomermodel(int order_id) {
		return custservice.getCustomermodel(order_id);
	}
	
}