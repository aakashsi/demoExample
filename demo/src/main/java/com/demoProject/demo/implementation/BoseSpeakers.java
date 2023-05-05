package com.demoProject.demo.implementation;

import org.springframework.stereotype.Component;

import com.demoProject.demo.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

	public String makeSound() {
		return "Playing Music with Bose Speakers";
	}

}
