package com.EmployeManagement.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.EmployeManagement.entity.Employee;

public class EmployeeService
{
	public static HashSet<Employee> empset = new HashSet<Employee>();

	Employee em = new Employee();
	@Autowired
	Employee employee;
	

	Employee emp1 = new Employee(101, "John", 25000, "john123", "1234", "MH", "airoli", 675890);
	Employee emp2 = new Employee(102, "kush", 25000, "kush12", "1234", "MH", "MG road", 675450);
	Employee emp3 = new Employee(103, "Ram", 35000, "Ram123", "3456", "UP", "Ayodhya", 768876);
	Employee emp4 = new Employee(104, "maruthi", 45000, "mar123", "32132", "MH", "bagyanagar", 768954);

	Scanner sc = new Scanner(System.in);
	boolean flag = false;
	int id;
	String name;
	int salary;
	String username;
	String password;
	String state;
	String city;
	int pincode;

	public EmployeeService() {
	
//		empset.add(emp1);
//		empset.add(emp2);
//		empset.add(emp3);
//		empset.add(emp4);
	}

	// view all
	public void viewAllEmps() {
		for (Employee emp : empset) {
			System.out.println(emp);
		}
	}

	// view on id
	public void viewEmp() {

		System.out.println("Enter id: ");
		id = sc.nextInt();
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println(emp);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Employee with this id is not present");
		}
	}

	// update
	public void updateEmployee() {
		System.out.println("Enter the ID: ");
		id = sc.nextInt();
		boolean flag = false;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter new salary: ");
				salary = sc.nextInt();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Employee is not found");
		} else {
			System.out.println("Employee Details updated successfully");
		}

	}

	// delete
	public void deleteEmp() {
		System.out.println("Enter ID:");
		id = sc.nextInt();
		boolean flag = false;
		Employee empdelete = null;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				empdelete = emp;
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Employee id not present");
		} else {
			empset.remove(empdelete);
			System.out.println("Employee delete successfully");
		}
	}

	// add
	public void addEmp() {
		EmployeeHelper em = new EmployeeHelper();
		for (int i = 0; i <= id;i++) {

			try {
				System.out.println("Enter ID: ");
				id = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter Name: ");
				name = sc.next();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter Salary: ");
				salary = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter Username: ");
				username = sc.next();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter Password: ");
				password = sc.next();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter State: ");
				state = sc.next();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter city: ");
				city = sc.next();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			}

			try {
				System.out.println("Enter Pincode: ");
				pincode = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e);
				em.menu();
				break;
			} 
			
			Employee emp = new Employee(id, name, salary, username, password, state, city, pincode);
			Employee a = emp;
			empset.add(a);
//			empset.add(emp);
			System.out.println(a);
			System.out.println("Employee Added Successfully ");
			System.out.println(empset);
			em.menu();
			break;
			
				
			
		}
		
	}

}
