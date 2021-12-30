package com.example.car.car.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.car.car.model.Car;


@Repository
@Transactional
public interface CarRepo extends JpaRepository<Car,Integer>{

}