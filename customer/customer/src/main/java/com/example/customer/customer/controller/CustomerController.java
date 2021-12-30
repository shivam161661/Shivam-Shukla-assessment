package com.example.customer.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.customer.model.Customer;
import com.example.customer.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/all")
	public List<Customer> getAll() {
		return service.getAllCustomers();
	}

	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {

		return service.insertCustomer(customer);
	}
	
	@DeleteMapping("/delete/{mobile}")
	public String deleteCustomer(@PathVariable int mobile) {
		
		return service.deleteCustomer(mobile);
		
	}
	
	
	}

