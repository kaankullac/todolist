package com.example.todolist1.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist1.core.abstracts.CheckEmailService;
import com.example.todolist1.dataaccess.abstracts.UserDao;
import com.example.todolist1.entities.concretes.User;


@Service
public class CheckEmailManeger implements CheckEmailService {

	private UserDao userDao;
	
	@Autowired
	public CheckEmailManeger(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public boolean check(User user) {
		for(User test :userDao.findAll()) {
			if(user.getEmail().equals(test.getEmail())) {
				System.out.println("Kullanılmış e mail");
				return false;
			}
			
			
		}
		return false;
	}

}