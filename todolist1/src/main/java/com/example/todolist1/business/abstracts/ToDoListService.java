package com.example.todolist1.business.abstracts;

import java.util.List;

import com.example.todolist1.entities.concretes.ToDoList;



public interface ToDoListService {
	List<ToDoList> getAll();
	void Add(ToDoList toDoList);
	void Delete(ToDoList toDoList);
	void Update(String listName, int toDoListId);
	void UpComplete(boolean complete, int toDolistId);
}
