package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.dao.UserRepo;

@RestController

public class UserController {
	
	@Autowired
	UserRepo repo1;
	
	@RequestMapping("/")
	public ModelAndView home() {
		//	return "home.jsp";
			ModelAndView mv= new ModelAndView("home.jsp");
			return mv;
		}
}