package com.app.Main;

public class User {
	private int id;
	private String name;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String num;
	
	public User(int id, String name, String lastName, String userName, String password, String email, String num) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.num = num;
	}
	public User() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", email=" + email + ", num=" + num + "]";
	}
	
	
}

