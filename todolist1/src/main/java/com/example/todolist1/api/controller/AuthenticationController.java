package com.example.todolist1.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist1.business.authentication.AuthenticationService;
import com.example.todolist1.entities.DTO.UserDTO;

@RestController
@RequestMapping("/api/authentication")
public class AuthenticationController {
	
	
	private AuthenticationService authenticationService;

	@Autowired
	public AuthenticationController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String email,@RequestParam String password ) {
		
		return authenticationService.login(email, password);
	}
	@PostMapping("/register")
	public String register(@RequestBody UserDTO userDTO) {
		return authenticationService.register(userDTO);
	}
	
	
}
