package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.User;
import com.klef.jfsd.springboot.service.UserService;

@RestController
@RequestMapping("api")

public class ClientController 

{
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String demo() {
		return "Rest API with JPA Demo";
		
	}
	
	@PostMapping("add")
	public String addUser(@RequestBody User user)
	{
		return service.addUser(user);
	}
	
	@PutMapping("update")
	public String updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@GetMapping("displayall")
	public List<User> displayallusers()
	{
		return service.displayAllUsers();
	}
	
	@GetMapping("display")
	public User displayuserbyid(@RequestParam("id") int uid) {
		return service.displayById(uid);
		
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteUser(@PathVariable("id") int uid) {
		
		return service.deleteUser(uid);
	}
	
	

}
