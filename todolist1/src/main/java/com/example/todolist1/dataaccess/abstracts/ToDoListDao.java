package com.example.todolist1.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist1.entities.concretes.ToDoList;



public interface ToDoListDao extends JpaRepository<ToDoList,Integer> {
	
	ToDoList getById(int id);
}

