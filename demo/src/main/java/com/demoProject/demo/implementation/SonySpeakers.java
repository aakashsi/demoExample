package com.demoProject.demo.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.demoProject.demo.interfaces.Speakers;

@Component
@Primary
public class SonySpeakers implements Speakers {


	public String makeSound() {
		return "Playing Music with Sony Speakers";
	}
	
}
