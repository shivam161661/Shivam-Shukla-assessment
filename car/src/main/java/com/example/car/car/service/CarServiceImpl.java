package com.example.car.car.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.car.car.model.Car;
import com.example.car.car.repo.CarRepo;


@Service
public class CarServiceImpl implements Carservice{
	
	
	@Autowired
	CarRepo repo;

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public String insertCar(Car car) {
		// TODO Auto-generated method stub
		repo.save(car);
		return "Car Registered";
	}

	@Override
	public String deleteCar(int car_no) {
		// TODO Auto-generated method stub
		
		repo.deleteById(car_no);
		return "Person record deleted";
	}

	@Override
	public Optional<Car> searchById(int car_no) {
		// TODO Auto-generated method stub
		
		return repo.findById(car_no);
		
	}

}