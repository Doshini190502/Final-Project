package com.verizon.csp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.csp.model.Catalogmodel;
import com.verizon.csp.repo.Catalogrepo;
@RestController
@RequestMapping(value="/catalogmodel/",method= {RequestMethod.GET,RequestMethod.POST})
public class Catalogcontroller {
	private Catalogrepo catrepo;
	@Autowired
	public Catalogcontroller(Catalogrepo catrepo) {
		this.catrepo=catrepo;
	}
	//@RequestMapping("/allcatalog")
	//public List<Catalogmodel>getAllCatalogmodels(){
		//return catservice.getAllCatalogmodels();
	@GetMapping("create")
	public String createcatalogmodel(Catalogmodel catmodel) {
		return "catalog";
	}
	@PostMapping("/submit-plan")
	public String save(Catalogmodel catmodel)
	{this.catrepo.save(catmodel);
	return "index";
	}
	//@DeleteMapping("/delete/{plan_id}")
	//public void deleteCatalogmodel(@PathVariable Integer plan_id){
		//catservice.deleteCatalogmodel(plan_id);

}