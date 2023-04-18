package com.employeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {

	private static List<Employee> list = new ArrayList<>();

	private Scanner sc = new Scanner(System.in);

	private int nextId = 1;

	public void addEmployee() {

		
		System.out.println("Kindly enter te name of empoyee");
		String name = sc.next();

		System.out.println("Kindly enter te salary of empoyee");
		double salary = sc.nextDouble();

		System.out.println("Kindly enter te city of empoyee");
		String city = sc.next();

		sc.nextLine();
		
		list.add(new Employee(nextId++,name,salary,city));
		System.out.println("Employee Added successfully");

	}
	
	public static Employee findEmployeeById(int id) {
		for(Employee emp :list) {
			
			if(emp.getId()==id) 
				return emp;	
		}
		return null;
		
	}
	
	public void displayEmployee() {
		if(list.isEmpty()) {
			System.out.println("There is no employee to display");
			return;
		}else {
			System.out.println("EmployeeId\tE EmployeeName\t EmployeeSalary\t EmployeeCity");
			for(Employee emp:list) {
				System.out.println(emp.getId()+"\t\t"+emp.getName()+"\t\t"+emp.getSalary()+"\t\t"+emp.getCity());
			}
		}
		
	}
	
	public void updateEmployee() {
		System.out.println("enter employee id to be updated");
		int newId = sc.nextInt();
		Employee employee = findEmployeeById(newId);
		if(employee==null) {
			System.out.println("the employee with "+newId+" does not exist");
			return;
		}else {
			System.out.println("enter the employee new name");
			String newName = sc.next();
			
			System.out.println("enter the employee new salary");
			double newSalary = sc.nextDouble();
			
			System.out.println("enter the employee new city");
			String newcity = sc.next();
			
			employee.setName(newName);
			employee.setCity(newcity);
			employee.setSalary(newSalary);	
			System.out.println("employee updated successfully ");
		}
		
	}
	
}
