package com.teamproject.hateoaseaxample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamproject.hateoaseaxample.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	
}
