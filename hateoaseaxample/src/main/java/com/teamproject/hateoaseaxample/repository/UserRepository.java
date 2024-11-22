package com.teamproject.hateoaseaxample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.teamproject.hateoaseaxample.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
}