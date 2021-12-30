package com.example.customer.customer.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.customer.model.Customer;


@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}