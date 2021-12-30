package com.example.trip.trip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.trip.trip.model.Trip;

public interface TripService {
	
	public List<Trip> getAllTrips();
	public String insertTrip(Trip trip);
	public String deleteTrip(int trip_id);
	public Optional<Trip> searchById(int trip_id);

}