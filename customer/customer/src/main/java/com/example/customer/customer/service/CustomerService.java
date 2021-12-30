package com.example.customer.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.customer.customer.model.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public String insertCustomer(Customer customer);
	public String deleteCustomer(int mobile);


}