package com.sample.rest.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.rest.domain.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	
}
