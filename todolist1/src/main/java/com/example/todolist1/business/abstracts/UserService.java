package com.example.todolist1.business.abstracts;

import java.util.List;

import com.example.todolist1.core.utilities.result.Result;
import com.example.todolist1.entities.concretes.User;



public interface UserService {
	List<User> getAll();
	Result Add(User user);
	Result Delete(User user);
	User GetUserByEmail(String email);
	boolean ExistUserByEmail(String email);
}
