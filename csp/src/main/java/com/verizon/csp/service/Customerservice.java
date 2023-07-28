package com.verizon.csp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.csp.model.Customermodel;
import com.verizon.csp.repo.Customerrepo;
@Service
public class Customerservice {
	@Autowired
	private final Customerrepo custrepo;
public Customerservice(Customerrepo custrepo) {
	this.custrepo=custrepo;
}
public List<Customermodel>getAllCustomermodels(){
	return custrepo.findAll();
}

public Customermodel createCustomermodel(Customermodel customermodel) {
	return custrepo.save(customermodel);
}
public Customermodel updateCustomermodel(int cust_id,Customermodel customermodel) {
	Customermodel existingCustomermodel=custrepo.findById(cust_id).orElse(null);
	if(existingCustomermodel!=null) {
		existingCustomermodel.setCust_name(customermodel.getCust_name());
		existingCustomermodel.setCust_id(customermodel.getCust_id());
		return custrepo.save(existingCustomermodel);
	}
	return null;
}
}
