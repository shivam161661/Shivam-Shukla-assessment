package com.example.customer.customer.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.customer.customer.model.Customer;
import com.example.customer.customer.repo.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	CustomerRepo repo;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Customer Registered";
	}

	@Override
	public String deleteCustomer(int mobile) {
		// TODO Auto-generated method stub
		
		repo.deleteById(mobile);
		return "Person record deleted";
	}

	}
	

