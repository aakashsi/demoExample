package com.demoProject.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demoProject.demo.services.VehicleServices;

@Component("vehicleBean")
public class Vehicle {
	
	private String name = "Honda";
	private final VehicleServices vehicleServices;
	
	
	@Autowired
	public Vehicle(VehicleServices vehicleServices) {
		this.vehicleServices = vehicleServices;
	}

	public VehicleServices getVehicleServices() {
		return vehicleServices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

}
