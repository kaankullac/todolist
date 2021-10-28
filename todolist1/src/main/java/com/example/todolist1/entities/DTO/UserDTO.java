package com.example.todolist1.entities.DTO;

public class UserDTO {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String passwordRepeat;
	
	public UserDTO() {
		
	}
	
	public UserDTO(String firstName, String lastName, String email, String password, String passwordRepeat) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.passwordRepeat = passwordRepeat;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordRepeat() {
		return passwordRepeat;
	}


	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
}
