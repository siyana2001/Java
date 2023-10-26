package com.example.demo1.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private int id;
	   private String name;
	//   private int age;
	   private String mail;
	   private String phone;
	   private String password;
	  	   
	     
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public int getAge() {
//		return age;
	//}
	//public void setAge(int age) {
//		this.age = age;
	//}
	
	}