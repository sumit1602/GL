package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ClientSharingApplication {
	//@Value("${spring.application.name}")
	// private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientSharingApplication.class, args);
	}
	
//	public void run(ApplicationArguments arg0) throws Exception {
//	      System.out.println("Hello World from Application Runner");
//	
//	}
	
//	public ModelAndView home() {
//		//	return "home.jsp";
//			ModelAndView mv= new ModelAndView("home.jsp");
//			return mv;
//		}
	   
//	   @RequestMapping(value = "/")
//	   public String name() {
//	      return name;
//		   }
//	
//	@RequestMapping(value = "/")
//	   public String hello() {
//	      return "Hello Worldq";
//	   }

}
