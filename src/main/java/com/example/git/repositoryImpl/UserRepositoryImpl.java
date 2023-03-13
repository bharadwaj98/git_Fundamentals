package com.example.git.repositoryImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.git.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
