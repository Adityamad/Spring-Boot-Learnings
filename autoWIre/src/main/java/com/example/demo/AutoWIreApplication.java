package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutoWIreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(AutoWIreApplication.class, args);
		
		Alian a=context.getBean(Alian.class);//it will find the object of type alian class in spring container and inject
		a.show();
		
		Alian a1=context.getBean(Alian.class);// here it will not create new object just using same object
		a1.show(); 
		
	}

	//Here even if you don't get object injected uisng getBean() then also spring boot will create object of @component class by default.
}
