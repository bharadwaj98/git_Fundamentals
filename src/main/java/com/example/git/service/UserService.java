package com.example.git.service;

import com.example.git.model.User;

public interface UserService {
	
	public String saveUser(User user);
	
	public String updateUser(User user);
	
	public String delteUser(User user);

}
