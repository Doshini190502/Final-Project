package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.repo.Catalogrepo;
import com.verizon.csp.model.Catalogmodel;
@Service
public class Catalogservice {
	@Autowired
	private final Catalogrepo catrepo;
public Catalogservice(Catalogrepo catrepo) {
	this.catrepo=catrepo;
}
public List<Catalogmodel>getAllCatalogmodels(){
	return catrepo.findAll();
}

public Catalogmodel createCatalogmodel(Catalogmodel catalogmodel) {
	return catrepo.save(catalogmodel);
}
public Catalogmodel updateCatalogmodel(int plan_id,Catalogmodel catalogmodel) {
	Catalogmodel existingCatalogmodel=catrepo.findById(plan_id).orElse(null);
	if(existingCatalogmodel!=null) {
		existingCatalogmodel.setPlan_name(catalogmodel.getPlan_name());
		existingCatalogmodel.setPrice(catalogmodel.getPrice());
		existingCatalogmodel.setDuration(catalogmodel.getDuration());
		return catrepo.save(existingCatalogmodel);
	}
	return null;
}
public void deleteCatalogmodel(Integer plan_id){
	catrepo.deleteById(plan_id);
}

}
