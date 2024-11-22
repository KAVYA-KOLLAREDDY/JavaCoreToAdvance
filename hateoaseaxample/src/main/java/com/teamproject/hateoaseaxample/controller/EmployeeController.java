package com.teamproject.hateoaseaxample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamproject.hateoaseaxample.entity.Employee;
import com.teamproject.hateoaseaxample.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeController{
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.retriveAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		var result = employeeService.retriveEmployee(id);
		return result;
	}
	
	@PostMapping("/employees")
	public List<Employee> createEmployee(@RequestBody Employee employee){
		System.out.println("Employee : " + employee);
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/employees")
	public List<Employee> updateEmployee(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public List<Employee> deleteEmployee(@PathVariable Integer id){
		return employeeService.deleteEmployee(id);
	}
}