package com.example.todolist1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	
	@Column(name="description")
	private String description;
	
	@Column(name="complete")
	private boolean complete;
	
	@ManyToOne
	@JoinColumn(name="todolist_id")
	private ToDoList toDoList;

	public Task() {
		
	}
	
	public Task(int id, String description, boolean complete, ToDoList toDoList) {
		super();
		this.id = id;
		this.description = description;
		this.complete = complete;
		this.toDoList = toDoList;
	}

	public int getId() {
		return id;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public ToDoList getToDoList() {
		return toDoList;
	}

	public void setToDoList(ToDoList toDoList) {
		this.toDoList = toDoList;
	}
	

}