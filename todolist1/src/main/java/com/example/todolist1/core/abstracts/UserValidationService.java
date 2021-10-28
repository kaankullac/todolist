package com.example.todolist1.core.abstracts;

import com.example.todolist1.entities.concretes.User;

public interface UserValidationService {

	boolean isValidMail(String email);
	boolean isValidName(String firstName, String lastName);
	boolean isValidPassword (String password);
	boolean isValidRepeatPassword(String password, String passwordRepeat);
}
