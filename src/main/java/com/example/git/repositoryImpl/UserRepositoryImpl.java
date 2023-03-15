package com.example.git.repositoryImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.git.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String getEmployeeName(String id) {

		String sql = "select emp_name from employee where emp_id = ?";
		System.out.println(sql);

		String name = jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
		return name;
	}

}
