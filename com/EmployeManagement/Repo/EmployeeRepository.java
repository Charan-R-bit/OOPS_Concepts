package com.EmployeManagement.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EmployeManagement.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
