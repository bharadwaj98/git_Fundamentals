package com.example.git.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.git.repository.UserRepository;
import com.example.git.repositoryImpl.UserRepositoryImpl;

@Configuration
public class DataBaseConfiguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/learning", "root",
				"root");
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		return datasource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}

	@Bean
	public UserRepository userRepository() {
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		userRepository.setJdbcTemplate(jdbcTemplate());
		return userRepository;

	}

}
