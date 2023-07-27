package com.verizon.csp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.repo.Orderingrepo;
import com.verizon.csp.model.Orderingmodel;
@Service
public class Orderingservice {
	@Autowired
	private final Orderingrepo ordrepo;
public Orderingservice(Orderingrepo ordrepo) {
	this.ordrepo=ordrepo;
}
public List<Orderingmodel>getAllOrderingmodels(){
	return ordrepo.findAll();
}

public Orderingmodel createOrderingmodel(Orderingmodel orderingmodel) {
	return ordrepo.save(orderingmodel);
}

public void deleteOrderingmodel(Integer order_id){
	ordrepo.deleteById(order_id);
}
public Orderingmodel getOrderingmodel(int order_id) {
	return ordrepo.findById(order_id).orElse(null);
}
}
