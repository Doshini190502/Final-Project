package com.verizon.csp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Orderingmodel {
	@ManyToOne//Many books can be written by author
	@JoinColumn(name="paln_id")
	private Catalogmodel catalogmodel;
	@Id
	private int order_id;
	
	public Orderingmodel() {
		//TODO Auto-generated constructor stub
		super();
	}

	public Catalogmodel getCatalogmodel() {
		return catalogmodel;
	}

	public void setCatalogmodel(Catalogmodel catalogmodel) {
		this.catalogmodel = catalogmodel;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	
}

