package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProject1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =SpringApplication.run(FirstProject1Application.class, args);
//		Alien a = context.getBean(Alien.class);
//		a.show();
//		Alien b = context.getBean(Alien.class);
//		b.show();
	}

}
