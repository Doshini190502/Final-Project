package com.verizon.csp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.csp.model.Catalogmodel;
import com.verizon.csp.service.Catalogservice;
@RestController
@RequestMapping("/api/catalogmodel")
public class Catalogcontroller {
	private Catalogservice catservice;
	@Autowired
	public Catalogcontroller(Catalogservice catservice) {
		this.catservice=catservice;
	}
	@RequestMapping("/allcatalogmodel")
	public List<Catalogmodel>getAllCatalogmodels(){
		return catservice.getAllCatalogmodels();
	}
	@PostMapping("/insertcatalogmodel")
	public Catalogmodel createCatalogmodel(@RequestBody Catalogmodel catalogmodel) {
		return catservice.createCatalogmodel(catalogmodel);
	}
	@PostMapping("/updatecatalogmodel")
	public Catalogmodel updateCatalogmodel(int plan_id,Catalogmodel catalogmodel) {
		Catalogmodel existingCatalogmodel=catservice.updateCatalogmodel(plan_id,catalogmodel);
		if(existingCatalogmodel!=null) {
			existingCatalogmodel.setPlan_name(catalogmodel.getPlan_name());
			existingCatalogmodel.setPrice(catalogmodel.getPrice());
			existingCatalogmodel.setDuration(catalogmodel.getDuration());
			return catservice.createCatalogmodel(existingCatalogmodel);
		}
		return null;
	}
	@DeleteMapping("/deletecatalogmodel")
	public void deleteCatalogmodel(Integer plan_id){
		catservice.deleteCatalogmodel(plan_id);
	}
	@GetMapping("/all")
	public Catalogmodel getCatalogmodel(int plan_id) {
		return catservice.getCatalogmodel(plan_id);
	}
	
}