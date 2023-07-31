package com.verizon.csp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.repo.Orderingrepo;
import com.verizon.csp.model.Orderingmodel;
@Service
public class Orderingservice {
	private final  Orderingrepo orderrepo;
	@Autowired
	public Orderingservice(Orderingrepo orderrepo) 
	{
		this.orderrepo = orderrepo;
		
	}
	  
	public List<Orderingmodel> getAllOrderModel()
	{
		return orderrepo.findAll();
	}

	public Orderingmodel createordermodel(Orderingmodel OrderModel) {
		return orderrepo.save(OrderModel);
	}
	public Orderingmodel updateOrderModel(Integer plan_id, Orderingmodel od)
	{
		Orderingmodel existingOrderingmodel= orderrepo.findById(plan_id).orElse(null);
		if(existingOrderingmodel !=null)
		{
			existingOrderingmodel.setPlan(od.getPlan());
			existingOrderingmodel.setPlanid(od.getPlanid());
			return orderrepo.save(existingOrderingmodel);
		}
		return null;
	
	
	}
}
