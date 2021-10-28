package com.example.todolist1.dataaccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist1.entities.concretes.Task;



public interface TaskDao extends JpaRepository<Task,Integer>{

}
