package com.employeeManagement;

public class Employee {
	
	private int id;
	
	private String name;
	private double salary;
	private String city;
	public Employee() {

		// TODO Auto-generated constructor stub
	}
	public Employee(int id,  String name,double salary, String city) {

		this.id = id;
		this.salary = salary;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	

}
