package com.example.todolist1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist1.business.abstracts.UserService;
import com.example.todolist1.core.abstracts.UserValidationService;
import com.example.todolist1.core.utilities.result.Result;
import com.example.todolist1.dataaccess.abstracts.UserDao;
import com.example.todolist1.entities.concretes.User;




@Service
public class UserManager implements UserService{

	private UserDao userDao;
	private UserValidationService userValidationService;
	
	@Autowired
	public UserManager(UserDao userDao, UserValidationService userValidationService) {
		super();
		this.userDao = userDao;
		this.userValidationService = userValidationService;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

	@Override
	public Result Add(User user) {

			userDao.save(user);
			return new Result(true, "Geçerli kullanıcı");
		
		
	}


	@Override
	public Result Delete(User user) {
		userDao.delete(user);
		return new Result(true,"silindi");
		
	}

	@Override
	public User GetUserByEmail(String email) {
		
		return userDao.getByEmail(email);
	}

	@Override
	public boolean ExistUserByEmail(String email) {
		
		return userDao.existsByEmail(email);
	}
	

}