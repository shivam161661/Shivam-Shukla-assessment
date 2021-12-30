package com.example.trip.trip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trip.trip.model.Trip;
import com.example.trip.trip.service.TripService;

@RestController
public class TripController {

	@Autowired
	TripService service;

	@GetMapping("/all")
	public List<Trip> getAll() {
		return service.getAllTrips();
	}

	@PostMapping("/add")
	public String addTrip(@RequestBody Trip trip) {

		return service.insertTrip(trip);
	}
	
	@DeleteMapping("/delete/{trip_id}")
	public String deleteTrip(@PathVariable Integer trip_id) {
		
		return service.deleteTrip(trip_id);
		
	}
	
	@GetMapping("/find/{trip_id}")
	public Optional<Trip> findTrip(@PathVariable Integer trip_id) {
		
		return service.searchById(trip_id);
		
	}}

