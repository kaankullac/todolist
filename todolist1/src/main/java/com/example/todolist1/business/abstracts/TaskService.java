package com.example.todolist1.business.abstracts;

import java.util.List;

import com.example.todolist1.entities.concretes.Task;



public interface TaskService {
	List<Task> getAll();
	void Add(Task task);
	void Delete(Task task);
	void Update(String description,int taskId);
	void UpComplete (boolean complete ,int taskId);

}
