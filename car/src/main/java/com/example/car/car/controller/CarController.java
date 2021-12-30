package com.example.car.car.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.car.model.Car;
import com.example.car.car.service.Carservice;

@RestController
public class CarController {

	@Autowired
	Carservice service;

	@GetMapping("/all")
	public List<Car> getAll() {
		return service.getAllCars();
	}

	@PostMapping("/add")
	public String addCar(@RequestBody Car car) {

		return service.insertCar(car);
	}
	
	@DeleteMapping("/delete/{car_no}")
	public String deleteCar(@PathVariable Integer car_no) {
		
		return service.deleteCar(car_no);
		
	}
	
	@GetMapping("/find/{car_no}")
	public Optional<Car> findCar(@PathVariable Integer car_no) {
		
		return service.searchById(car_no);
		
	}

}