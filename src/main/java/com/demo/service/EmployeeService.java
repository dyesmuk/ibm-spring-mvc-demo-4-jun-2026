package com.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
public class EmployeeService {

	private List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee(1, "Sonu", 50000),
			new Employee(2, "Monu", 60000), new Employee(3, "Tonu", 55000)));

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		for (Employee emp : employeeList) {
			if (emp.getId() == id)
				return emp;
		}
		return null;
	}

	public Employee addEmployee(Employee employee) {
		employeeList.add(employee);
		return null;
	}
}
