package com.example.car.car.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
@Id
int car_no;
@Column
String car_owner;
@Column
String fuel_type;
@Column
String no_seats;
@Column
String model;
public Car() {
	super();
}
public Car(int car_no, String car_owner, String fuel_type, String no_seats, String model) {
	super();
	this.car_no = car_no;
	this.car_owner = car_owner;
	this.fuel_type = fuel_type;
	this.no_seats = no_seats;
	this.model = model;
}
public int getCar_no() {
	return car_no;
}
public void setCar_no(int car_no) {
	this.car_no = car_no;
}
public String getCar_owner() {
	return car_owner;
}
public void setCar_owner(String car_owner) {
	this.car_owner = car_owner;
}
public String getFuel_type() {
	return fuel_type;
}
public void setFuel_type(String fuel_type) {
	this.fuel_type = fuel_type;
}
public String getNo_seats() {
	return no_seats;
}
public void setNo_seats(String no_seats) {
	this.no_seats = no_seats;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}



}
