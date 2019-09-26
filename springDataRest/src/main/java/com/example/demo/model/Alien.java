package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	@GeneratedValue
	private int aid;
	private String name;
	private String tech;
	
	
	public String getTech() {
		return tech;
	}


	public void setTech(String tech) {
		this.tech = tech;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}






	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", tech=" + tech + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
