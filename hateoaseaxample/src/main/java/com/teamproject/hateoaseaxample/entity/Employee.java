package com.teamproject.hateoaseaxample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee{
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String email;
	private double number;
	private String dateOfJoining;
	private String gender;
	private String status;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String email, double number, String dateOfJoining, String gender, String status,
			double salary) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.dateOfJoining = dateOfJoining;
		this.gender = gender;
		this.status = status;
		this.salary = salary;
	}
	public Employee(int id, String name, String email, double number, String dateOfJoining, String gender,
			String status, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.dateOfJoining = dateOfJoining;
		this.gender = gender;
		this.status = status;
		this.salary = salary;
	}
	
	public Employee() {	
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", dateOfJoining="
				+ dateOfJoining + ", gender=" + gender + ", status=" + status + ", salary=" + salary + "]";
	}
	
	
}