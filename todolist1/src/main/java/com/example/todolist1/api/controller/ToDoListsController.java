package com.example.todolist1.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist1.business.abstracts.ToDoListService;
import com.example.todolist1.entities.concretes.ToDoList;



@RestController
@RequestMapping("/api/toDoLists")
public class ToDoListsController {

	private ToDoListService toDoListService;

	@Autowired
	public ToDoListsController(ToDoListService toDoListService) {
		super();
		this.toDoListService = toDoListService;
	}
	@GetMapping("/getall")
	public List<ToDoList> getAll(){
		return this.toDoListService.getAll();
		
	}
	@PostMapping("/add")
	public void Add(@RequestBody ToDoList toDoList) {
		this.toDoListService.Add(toDoList); }
	
	@PostMapping("/delete")
	public void Delete(@RequestBody ToDoList toDoList) {
		this.toDoListService.Delete(toDoList); }
	
	@PostMapping("/update")
	public void Update(@RequestBody String listName,@RequestParam int toDoListId) {
		this.toDoListService.Update(listName,toDoListId); }
	
	@PostMapping("/upComplete")
	public void UpComplete(@RequestParam boolean complete,@RequestParam int toDoListId) {
		this.toDoListService.UpComplete(complete,toDoListId); }
}