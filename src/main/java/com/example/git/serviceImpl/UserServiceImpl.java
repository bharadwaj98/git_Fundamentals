package com.example.git.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.git.model.User;
import com.example.git.repository.UserRepository;
import com.example.git.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	

	@Override
	public String saveUser(User user) {
		
		
		
		
		return null;
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
