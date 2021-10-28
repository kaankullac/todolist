package com.example.todolist1.business.authentication;

import com.example.todolist1.entities.DTO.UserDTO;
import com.example.todolist1.entities.concretes.User;

public interface AuthenticationService {
String login(String email, String password );
String register(UserDTO user);
}
