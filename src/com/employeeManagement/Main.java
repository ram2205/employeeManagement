package com.employeeManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    employeeManagement.addEmployee();
                    break;
                case 2:
                    employeeManagement.displayEmployee();
                    break;
                case 3:
                    employeeManagement.updateEmployee();
                    break;
//                case 4:
//                    employeeManagement.deleteEmployee();
//                    break;
                case 0:
                    System.out.println("Exiting Employee Management System...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);
        scanner.close();
    }

}
