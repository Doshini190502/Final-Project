package com.verizon.csp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.Orderingmodel;
import com.verizon.csp.service.Orderingservice;
@RestController
@RequestMapping("/api/orderingmodel")
public class Orderingcontroller {
	private Orderingservice ordservice;
	@Autowired
	public Orderingcontroller(Orderingservice ordservice) {
		this.ordservice=ordservice;
	}
	@RequestMapping("/allorderingmodel")
	public List<Orderingmodel>getAllOrderingmodels(){
		return ordservice.getAllOrderingmodels();
	}
	@PostMapping("/insertorderingmodel")
	public Orderingmodel createOrderingmodel(@RequestBody Orderingmodel orderingmodel) {
		return ordservice.createOrderingmodel(orderingmodel);
	}
	@DeleteMapping("/deleteorderingmodel")
	public void deleteOrderingmodel(Integer order_id){
		ordservice.deleteOrderingmodel(order_id);
	}
	@GetMapping("/all")
	public Orderingmodel getOrderingmodel(int order_id) {
		return ordservice.getOrderingmodel(order_id);
	}
	
}