package com.demo.controller;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Employee;

@Controller
public class EmployeeController {

	
	@GetMapping("/employees")
	@ResponseBody
	public String getAllEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee(), new Employee()));
		System.out.println(employeeList);
		return employeeList.toString();
	}


	
//	@GetMapping("/employees")
//	@ResponseBody
//	public List<Employee> getAllEmployees() {
//		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee(), new Employee()));
//		System.out.println(employeeList);
//		return employeeList;
//	}

//	getAllEmployees()
//	getEmployeeById()
//	getEmployeeByName()
//	addEmployee()
//	updateEmployee()
//	deleteEmployee()

}
