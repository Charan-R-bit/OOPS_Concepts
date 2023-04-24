package com.Employe.Controller;

import java.util.HashSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeManagement.entity.Employee;
import com.EmployeManagement.service.EmployeeService;

@RestController
@RequestMapping("/control")
public class EmployeManagementController 
{
	@GetMapping("/get")
	public String get()
	{
		return "hello";
	}
//	public HashSet<Employee> get()
//	{
//		return EmployeeService.empset;
//	}
}
