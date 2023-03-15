package com.example.git.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.git.model.User;
import com.example.git.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {

		return service.saveUser(user);
	}

}
