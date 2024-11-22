package com.teamproject.hateoaseaxample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamproject.hateoaseaxample.entity.Employee;
import com.teamproject.hateoaseaxample.entity.User;
import com.teamproject.hateoaseaxample.repository.UserRepository;

@Service
public class UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
		public List<User> retriveAllUsers(){
			return userRepository.findAll();	
		}

		public User retriveUser(Integer id) {
			User user= userRepository.findById(id).orElse(null);
			return user;
		}
		public List<User> createUser(User user) {
//			return employeeRepository.save(employee);
			return this.retriveAllUsers();
		}
		
		public List<User> updateUser(User user) {
			userRepository.save(user);
			return this.retriveAllUsers();
		}
		
		public List<User> deleteUser(Integer id) {
			User user= this.retriveUser(id);
			userRepository.delete(user);
			return this.retriveAllUsers();
		}
}