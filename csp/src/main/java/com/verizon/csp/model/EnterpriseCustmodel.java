package com.verizon.csp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class EnterpriseCustmodel {
	@Id
	private int ec_id;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orderingmodel orderingmodel;
	private String ec_name;
	private String order_name;
	private String duration;
	private int ec_price;

	
	public EnterpriseCustmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEc_id() {
		return ec_id;
	}

	public void setEc_id(int ec_id) {
		this.ec_id = ec_id;
	}

	public String getEc_name() {
		return ec_name;
	}

	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return ec_price;
	}

	public void setPrice(int ec_price) {
		this.ec_price = ec_price;
	}

	
	
}
