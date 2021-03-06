package com.example.todolist1.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist1.business.abstracts.UserService;
import com.example.todolist1.core.utilities.result.Result;
import com.example.todolist1.entities.concretes.User;


@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super(); 
		this.userService = userService;
	}

	@GetMapping("/getall")
	public List<User> getAll(){
		return this.userService.getAll();
		
	}
	@PostMapping("/add")
	public Result Add(@RequestBody User user) {
		return  this.userService.Add(user); }
	
	@PostMapping("/delete")
	public Result Delete(@RequestBody User user) {
		return  this.userService.Delete(user); }
	
	
	
}