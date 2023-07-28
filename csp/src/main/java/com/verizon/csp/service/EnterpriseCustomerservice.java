package com.verizon.csp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.model.EnterpriseCustmodel;
import com.verizon.csp.repo.EnterpriseCustomerrepo;
@Service
public class EnterpriseCustomerservice {
	@Autowired
	private final EnterpriseCustomerrepo enterprisecustrepo;
public EnterpriseCustomerservice(EnterpriseCustomerrepo enterprisecustrepo) {
	this.enterprisecustrepo=enterprisecustrepo;
}
public List<EnterpriseCustmodel>getAllEnterpriseCustomermodels(){
	return enterprisecustrepo.findAll();
}

public EnterpriseCustmodel createEnterpriseCustomermodel(EnterpriseCustmodel enterprisecustomermodel) {
	return enterprisecustrepo.save(enterprisecustomermodel);
}
public EnterpriseCustmodel updateEnterpriseCustomermodel(int enterprisecust_id,EnterpriseCustmodel enterprisecustomermodel) {
	EnterpriseCustmodel existingEnterpriseCustomermodel=enterprisecustrepo.findById(enterprisecust_id).orElse(null);
	if(existingEnterpriseCustomermodel!=null) {
		existingEnterpriseCustomermodel.setEnterprisecust_name(enterprisecustomermodel.getEnterprisecust_name());
		return enterprisecustrepo.save(existingEnterpriseCustomermodel);
	}
	return null;
}
}
