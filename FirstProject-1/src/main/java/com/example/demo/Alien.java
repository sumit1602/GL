package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {
	
	private String name;
	private int aid;
	
	

	public Alien() {
		super();
		System.out.println("Object created once");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public void show() {
		System.out.print("in show");
	}

}
