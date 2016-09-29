package com.sample.rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sample.rest.service.EmployeeRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.sample.rest.service"})
public class Application implements CommandLineRunner {
	
		@Autowired
		private EmployeeRepository repository;
		
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}
		
		@Override
		public void run(String... args ) {
			repository.findAll();
		}
}
