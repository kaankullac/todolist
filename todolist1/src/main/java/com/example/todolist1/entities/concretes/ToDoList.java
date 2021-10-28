package com.example.todolist1.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="todolists")
public class ToDoList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="list_name")
	private String listName;
	
	@Column(name="complete")
	private boolean complete;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	


	public ToDoList() {
		
	}
	
	public ToDoList(int id, String listName, boolean complete, User user) {
		super();
		this.id = id;
		this.listName = listName;
		this.complete = complete;
		this.user = user;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}




}