package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component// this annotation help in creating object when appliction is started and it will store object in spring container
@Scope(value="prototype")//this is used for creating separate objects each time when getBean(Alian.class) is called.And it will not create single object by default without calling getBean().
public class Alian {
	
	int id;
	String name;
	String Tech;
	
	@Autowired// this will find the Laptop object in spring container and use it directly. 
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Alian() {
		super();
	System.out.println("Object created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}
	
	public void show() {
		System.out.println("In Alinan's show");
		
		laptop.compile();
	}

}
