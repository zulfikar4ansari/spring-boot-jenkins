package com.javatechie.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	
	public static final Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		log.info("Application get started");
	}


	public static void main(String[] args) {
		log.info("Application get executed");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
