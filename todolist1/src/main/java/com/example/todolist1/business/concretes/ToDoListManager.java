package com.example.todolist1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist1.business.abstracts.ToDoListService;
import com.example.todolist1.dataaccess.abstracts.ToDoListDao;
import com.example.todolist1.entities.concretes.ToDoList;



@Service
public class ToDoListManager implements ToDoListService {

	private ToDoListDao toDoListDao;
	
	@Autowired
	public ToDoListManager(ToDoListDao toDoListDao) {
		super();
		this.toDoListDao = toDoListDao;
	}

	@Override
	public List<ToDoList> getAll() {
		// TODO Auto-generated method stub
		return this.toDoListDao.findAll();
	}

	@Override
	public void Add(ToDoList toDoList) {
		toDoList.setComplete(false);
		toDoListDao.save(toDoList);
		
	}

	@Override
	public void Delete(ToDoList toDoList) {
		toDoListDao.delete(toDoList);
		
	}

	@Override
	public void Update(String listName, int toDoListId) {
		ToDoList updatedList = this.toDoListDao.getById(toDoListId);
		
		updatedList.setListName(listName);
		
		toDoListDao.save(updatedList);
		
	}
	@Override
	public void UpComplete(boolean complete, int toDoListId) {
		ToDoList updatedList = this.toDoListDao.getById(toDoListId);
		updatedList.setComplete(complete);
		toDoListDao.save(updatedList);
		
		
	}

}
