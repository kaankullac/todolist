package com.example.todolist1.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist1.entities.concretes.User;



public interface UserDao extends JpaRepository<User,Integer> {
	boolean existsByEmail(String email);
	User getByEmail(String email);
}