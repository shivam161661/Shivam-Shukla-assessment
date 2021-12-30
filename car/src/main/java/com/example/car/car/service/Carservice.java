package com.example.car.car.service;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.stereotype.Service;

import com.example.car.car.model.Car;

	public interface Carservice {
		
		public List<Car> getAllCars();
		public String insertCar(Car car);
		public String deleteCar(int car_no);
		public Optional<Car> searchById(int pid);

	}

