package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> list = employeeService.getAllEmployees();
		model.addAttribute("employees", list);
		return "employees";
	}

	@GetMapping("/employees/find")
	public String findEmployeeById(@RequestParam("id") int id, Model model) {
		Employee emp = employeeService.getEmployeeById(id);
		if (emp != null) {
			model.addAttribute("foundEmployee", emp);
		} else {
			model.addAttribute("notFound", "No employee found with ID: " + id);
		}
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}

	@PostMapping("/employees/add")
	public String addEmployee(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") double salary, Model model) {
		Employee employee = new Employee(id, name, salary);
		employeeService.addEmployee(employee);
		model.addAttribute("employees", employeeService.getAllEmployees());
		model.addAttribute("message", "Employee added successfully!");
		return "employees";
	}

//  getEmployeeByName()
//  updateEmployee()
//  deleteEmployee()

}