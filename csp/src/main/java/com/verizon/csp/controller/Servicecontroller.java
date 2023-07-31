package com.verizon.csp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.Servicemodel;
import com.verizon.csp.repo.Servicerepo;
@RestController
@RequestMapping(value="/api/servicemodel",method= {RequestMethod.GET,RequestMethod.POST})
public class Servicecontroller {
	private Servicerepo servrepo;
	@Autowired
	public Servicecontroller(Servicerepo servrepo) {
		this.servrepo=servrepo;
	}
	//@RequestMapping("/allservice")
	//public List<Servicemodel>getAllServicemodels(){
		//return servservice.getAllServicemodels();
	@GetMapping("/create")
	public String create(Servicerepo servrepo) {
		return "service";
	}
	@PostMapping("/submit-service")
	public String save(Servicemodel servmodel)
	{
		this.servrepo.save(servmodel);
			return "index";
	}
}