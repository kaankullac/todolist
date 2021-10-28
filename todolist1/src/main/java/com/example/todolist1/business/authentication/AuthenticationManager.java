package com.example.todolist1.business.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist1.business.abstracts.UserService;
import com.example.todolist1.core.abstracts.UserValidationService;
import com.example.todolist1.core.utilities.result.Result;
import com.example.todolist1.entities.DTO.UserDTO;
import com.example.todolist1.entities.concretes.User;

@Service
public class AuthenticationManager implements AuthenticationService {

	private UserService userService;
	private UserValidationService userValidationService;
	private User user;
	
	@Autowired
	public AuthenticationManager(UserService userService, UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
	}



	@Override
	public String login(String email, String password) {
		User user = userService.GetUserByEmail(email);
		if(user!=null) {
			if(user.getPassword().equals(password)) {
				return new String("Giris basarili");
				
			}
		}
		return new String ("Kullanici adi veya sifre yanlis");
	}



	@Override
	public String register(UserDTO user) {
		
		if(userService.ExistUserByEmail(user.getEmail())) {
			return new String( "Kullanilmis mail");
		}
		if(!userValidationService.isValidMail(user.getEmail())) {
			return new String( "Gecersiz Mail Formatı");
		}
		if(!userValidationService.isValidName(user.getFirstName(),user.getLastName())) {
			return new String("Gecersiz isim formatı");
		}
		if(!userValidationService.isValidPassword(user.getPassword())) {
			return new String("Sifreniz 2 karakterden uzun olmalidir ");
		}
		if(!userValidationService.isValidRepeatPassword(user.getPassword(),user.getPasswordRepeat())) {
			return new String("Sifreleriniz aynı degil.");
		}
		
		
		else {
			User createdUser=new User();
			createdUser.setEmail(user.getEmail());
			createdUser.setFirstName(user.getFirstName());
			createdUser.setLastName(user.getLastName());
			createdUser.setPassword(user.getPassword());
			userService.Add(createdUser);
			return new String("Hesabınız Oluşturuldu.");
		}
	}

}
