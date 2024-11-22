package com.teamproject.hateoaseaxample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamproject.hateoaseaxample.entity.Employee;
import com.teamproject.hateoaseaxample.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> retriveAllEmployees(){
	 return employeeRepository.findAll();	
	}

	public Employee retriveEmployee(Integer id) {
		Employee employee= employeeRepository.findById(id).orElse(null);
		return employee;
	}
	public List<Employee> createEmployee(Employee employee) {
//		return employeeRepository.save(employee);
		return this.retriveAllEmployees();
	}
	
	public List<Employee> updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return this.retriveAllEmployees();
	}
	
	public List<Employee> deleteEmployee(Integer id) {
		Employee employee= this.retriveEmployee(id);
		employeeRepository.delete(employee);
		return this.retriveAllEmployees();
	}
}