package com.example.trip.trip.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trip.trip.model.Trip;


@Repository
@Transactional
public interface TripRepo extends JpaRepository<Trip,Integer>{

}