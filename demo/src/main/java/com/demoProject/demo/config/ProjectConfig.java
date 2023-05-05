package com.demoProject.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demoProject.demo.implementation",
			"com.demoProject.demo.services"})

@ComponentScan(basePackageClasses = {com.demoProject.demo.model.Vehicle.class,
		com.demoProject.demo.model.Person.class})
public class ProjectConfig {
	
}
