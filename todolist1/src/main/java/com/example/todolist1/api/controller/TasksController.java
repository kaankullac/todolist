package com.example.todolist1.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist1.business.abstracts.TaskService;
import com.example.todolist1.entities.concretes.Task;



@RestController
@RequestMapping("/api/tasks")
public class TasksController {

	private TaskService taskService;

	@Autowired
	public TasksController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}
	@GetMapping("/getall")
	public List<Task> getAll(){
		return this.taskService.getAll();
		
	}
	@PostMapping("/add")
	public void Add(@RequestBody Task task) {
		this.taskService.Add(task); }
	
	@PostMapping("/delete")
	public void Delete(@RequestBody Task task) {
		this.taskService.Delete(task); }
	
	@PostMapping("/update")
	public void Update(@RequestBody String description, @RequestParam int taskId) {
		this.taskService.Update(description,taskId); }
	
	@PostMapping("/upcomplete")
	public void UpComplete(@RequestParam  boolean complete, @RequestParam int taskId) {
		this.taskService.UpComplete(complete,taskId); }
	
}
