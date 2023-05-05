package com.demoProject.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demoProject.demo.config.ProjectConfig;
import com.demoProject.demo.model.Person;
import com.demoProject.demo.model.Vehicle;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		//String[] persons = context.getBeanNamesForType(Person.class);
		Person person = context.getBean(Person.class);
		//String[] names = context.getBeanNamesForType(Vehicle.class);
		//Vehicle vehicle = context.getBean(Vehicle.class);
		//person.getVehicle().getVehicleServices().playMusic();
		//person.getVehicle().getVehicleServices().moveVehicle();
	}

}
