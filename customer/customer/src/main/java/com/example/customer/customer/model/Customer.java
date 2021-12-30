
package com.example.customer.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	int mobile;
	@Column
	String customer_name;
	@Column
	String address;
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Customer(String customer_name, String address, int mobile) {
		super();
		this.customer_name = customer_name;
		this.address = address;
		this.mobile = mobile;
	}
	public Customer() {
		super();
	}
	

}
