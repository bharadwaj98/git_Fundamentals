package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class GitFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitFundamentalsApplication.class, args);
		System.out.println("Git Changes");
		System.out.println("added by Rohan");
	}

}
