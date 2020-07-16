package com.assignement.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomException(String str) {
		super();
		System.out.println(str);
		EmployeeSystem.Operations();
	}
}

public class EmployeeSystem {

	public static Map<Integer, Employee> map = new HashMap<Integer, Employee>();

	public static void AddEmployeee(String name, int age, int id) {
		Employee emp = new Employee(name, age, id);
		map.put(id, emp);

		Operations();
	}

	public static void DeleteEmployeee(int EmpId) throws CustomException {
		if (map.containsKey(EmpId)) {
			map.remove(EmpId);
			System.out.println("Employee Successfully Deleted from the List !!");
		} else {
			throw new CustomException("Employee Not Found Exception");
		}

		Operations();
	}

	public static void SearchEmployeee(int EmpId) throws CustomException {
		if (map.containsKey(EmpId)) {
			// map.get(EmpId);
			System.out.println("Employee Details :- " + map.get(EmpId));
		} else {
			throw new CustomException("Employee Not Found Exception");
		}

		Operations();
	}

	public static void EmployeeeList() {
		System.out.println(map.toString());
	}

	public static void Operations() {

		System.out.println("\n****** Employee System *********");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Search Employee");
		System.out.println("4. Employee List");

		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

		if (userInput == 1) {
			System.out.println("Enter Employee Details(Name, age , Id)");
			Scanner scanner1 = new Scanner(System.in);

			String name = scanner1.next();
			int age = scanner1.nextInt();
			int id = scanner1.nextInt();

			if (!name.equals("") && age != 0 && id != 0) {
				AddEmployeee(name, age, id);
			}
		} else if (userInput == 2) {
			System.out.println("Enter Employee Id");
			Scanner scanner2 = new Scanner(System.in);

			int EmpId = scanner2.nextInt();

			try {
				DeleteEmployeee(EmpId);
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}

		} else if (userInput == 3) {
			System.out.println("Enter Employee Id");
			Scanner scanner3 = new Scanner(System.in);

			int EmpId = scanner3.nextInt();

			try {
				SearchEmployeee(EmpId);
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}

			Operations();
		} else if (userInput == 4) {
			EmployeeeList();

			Operations();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations();
	}
}

class Employee {
	private String name;
	private int age;
	private int employeeId;

	public Employee(String name, int age, int employeeId) {
		super();
		this.name = name;
		this.age = age;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", employeeId=" + employeeId + "]";
	}
}
