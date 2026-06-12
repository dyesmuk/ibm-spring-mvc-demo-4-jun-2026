package com.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.model.Employee;

public class EmployeeService {

	private List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee(1, "Sonu", 50000),
			new Employee(2, "Monu", 60000), new Employee(3, "Tonu", 55000)));

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		return null;
	}

	public Employee addEmployee() {
		return null;
	}
}
