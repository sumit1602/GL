package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

//@Controller
@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home() {
	//	return "home.jsp";
		ModelAndView mv= new ModelAndView("home.jsp");
		return mv;
	}
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home.jsp";
//	}
	
	@PostMapping(path="/alien", consumes="application/json")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@DeleteMapping(path="/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a=repo.getOne(aid);
		repo.delete(a);
		return "Deleted ${aid}";
	}
	
	@PutMapping(path="/alien")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
//	@RequestMapping("/getAlien")   //normal RequestMapping
//	public ModelAndView addAlien(@RequestParam int aid) {
//		ModelAndView mv= new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		System.out.println(repo.findByTech("ML"));
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByTechSorted("SPRING BOOT"));
//		mv.addObject(alien);
//		return mv;
//	}
	
	
	
//	@RequestMapping(path="/aliens", produces= {"application/xml"}) //only gives output as XML format
	@GetMapping(path="/aliens")   //REST APPROCH
	public List<Alien> getAliens() {
		
		//findAll simple return List of object but hold on who is converting it into JSON format ?
	   // In maven dependency we have jackson core, who is doing this by default 
		return repo.findAll(); 
		
	}
	
	@RequestMapping("/alien/{aid}")   //REST   //{aid}==wildcard
//	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		
		return repo.findById(aid);
	}
}
