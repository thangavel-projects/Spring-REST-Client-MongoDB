package com.epam.sample.rest.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.epam.sample.rest.domain.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	
}
