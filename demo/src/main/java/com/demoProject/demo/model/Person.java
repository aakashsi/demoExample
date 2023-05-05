package com.demoProject.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component(value = "personBean")
public class Person {

	private String name = "Aakash";

	//private final Vehicle vehicle;
	  
	/*
	 * @Autowired public Person(Vehicle vehicle) {
	 * System.out.println("Person bean created by Spring"); this.vehicle = vehicle;
	 * }
	 */

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public Vehicle getVehicle() { return vehicle; }
	 */

	public String getName() {
		return name;
	}

}
