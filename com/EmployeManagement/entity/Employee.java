package com.EmployeManagement.entity;


public class Employee {

	
	private int id;
	private String name;
	private int salary;
	private String username;
	private String password;
	private String state;
	private String city;
	private int pincode;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", username=" + username + ", password="
				+ password + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public Employee(int id, String name, int salary, String username, String password, String state, String city,
			int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.username = username;
		this.password = password;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public Employee() {
		super();
	}
	
	
	
	
	
}
