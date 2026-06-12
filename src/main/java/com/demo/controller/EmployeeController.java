package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import org.springframework.ui.Model;

@Controller
public class EmployeeController {

	EmployeeService employeeService = new EmployeeService();

//	@GetMapping("/employees")
//	@ResponseBody
//	public String getAllEmployees() {
//		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee(), new Employee()));
//		System.out.println(employeeList);
//		return employeeList.toString();
//	}

	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> list = employeeService.getAllEmployees();
		model.addAttribute("employees", list);
		return "employees";
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
