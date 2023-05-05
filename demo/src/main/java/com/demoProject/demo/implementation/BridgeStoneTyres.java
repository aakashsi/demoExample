package com.demoProject.demo.implementation;

import org.springframework.stereotype.Component;

import com.demoProject.demo.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

	public String rotate() {
		return "Vehicle moving with BridgeStoneTyres tyres";
	}

}
