package com.example.todolist1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist1.business.abstracts.TaskService;
import com.example.todolist1.dataaccess.abstracts.TaskDao;
import com.example.todolist1.entities.concretes.Task;


@Service
public class TaskManager implements TaskService{
	
	private TaskDao taskDao;

	@Autowired
	public TaskManager(TaskDao taskDao) {
		super();
		this.taskDao = taskDao;
	}

	@Override
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		return this.taskDao.findAll();
	}

	@Override
	public void Add(Task task) {
	task.setComplete(false);
	this.taskDao.save(task);
		
	}

	@Override
	public void Delete(Task task) {
		this.taskDao.delete(task);
	}

	@Override
	public void Update(String description, int taskId) {
		Task updatedTask = taskDao.getById(taskId);
		updatedTask.setDescription(description);
		taskDao.save(updatedTask);
		
		
	}

	@Override
	public void UpComplete(boolean complete, int taskId) {
		Task updatedTask = taskDao.getById(taskId);
		updatedTask.setComplete(complete);
		taskDao.save(updatedTask);
		
	}

}