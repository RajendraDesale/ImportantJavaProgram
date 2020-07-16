package com.concurrencypackage.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDeSerializationExample {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		// 1. Create an object e of Emloyee Class and set the values of its member
		// values
		Employee employee1 = new Employee();
		employee1.setEmployeeNumber(1);
		employee1.setEmployeeName("Employee1");

		/*
		 * Now we have our employee1 object which contains data in its member variables
		 * employeeNumber and employeeName
		 */

		File file = new File("abc.txt");
		// 2. Writing our object into a file using Serialization
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee1);
		/*
		 * Our object is serialized and saved as a file Employee1 (in the folder
		 * D:/objects)
		 */

		// 3. Retrieve the object from the file D:/objects/Employee1
		FileInputStream fileIutputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileIutputStream);
		Employee retrievedEmployee = (Employee) objectInputStream.readObject();

		// 4. Displaying values from the object retrieved
		System.out.println("Employee Number Retreived : " + retrievedEmployee.getEmployeeNumber());
		System.out.println("Employee Name Retreived : " + retrievedEmployee.getEmployeeName());
	}
}

class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int employeeNumber;
	String employeeName;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}