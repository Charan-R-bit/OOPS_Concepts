package com.EmployeManagement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.EmployeManagement.service.EmployeeHelper;

@SpringBootApplication
@EntityScan
public class EmployeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeManagementApplication.class, args);
		EmployeeHelper employeeHelper = new EmployeeHelper();
//		employeeHelper.helper();
		employeeHelper.menu();


	}

}
