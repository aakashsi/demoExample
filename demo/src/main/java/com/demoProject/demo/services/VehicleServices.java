package com.demoProject.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoProject.demo.interfaces.Speakers;
import com.demoProject.demo.interfaces.Tyres;

public class VehicleServices {

	@Autowired
	private Speakers speakers;
	private Tyres tyres;
	
	public void playMusic() {
		String music = speakers.makeSound();
		System.out.println(music);
	}
	
	public void moveVehicle() {
		String status = tyres.rotate();
		System.out.println(status);
	}

	public com.demoProject.demo.interfaces.Speakers getSpeakers() {
		return speakers;
	}

	public void setSpeakers(Speakers speakers) {
		this.speakers = speakers;
	}

	public Tyres getTyres() {
		return tyres;
	}

	@Autowired
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}
	
	
}
