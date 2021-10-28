package com.example.todolist1.core.concretes;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.todolist1.core.abstracts.UserValidationService;
import com.example.todolist1.dataaccess.abstracts.UserDao;
import com.example.todolist1.entities.concretes.User;



@Service
public class UserValidationManager implements UserValidationService{

	private UserDao userDao;
	
	@Autowired
	public UserValidationManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}







	@Override
	public boolean isValidMail(String email) {
		String regexString = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if (!Pattern.compile(regexString).matcher(email).matches()) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean isValidName(String firstName, String lastName) {
		if(firstName.length()<2 || lastName.length()<2) {
		return false;
		}
		return true;
	}


	@Override
	public boolean isValidPassword(String password) {
		if(password.length()<2) {
		return false;
		}
		return true;
	}

	@Override
	public boolean isValidRepeatPassword(String password, String passwordRepeat) {
		if(password.equals(passwordRepeat)) {
			return true;
		}
		return false;
	}
	

}
