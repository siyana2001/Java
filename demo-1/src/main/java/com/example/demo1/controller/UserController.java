package com.example.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.UserDto;
import com.example.demo1.modal.User;
import com.example.demo1.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService  userService;
	@PostMapping("/saveorup")
	 public boolean Savorupdate (@RequestBody UserDto dto) {
		return userService.Savorupdate(dto) ;	 
	
	 }
	
	@GetMapping("/dele")
	 public boolean deleteUserById(int id) {
		 return userService.deleteUserById(id);
	 }
	 
	@GetMapping("/getAll") 
	 public List<User>getAllUser(){
		 return userService.getAllUser();
		 
      }
	 
	@GetMapping("/getByy")
	 public Optional<User>getById(int id){
		 return userService.getById(id);
		 
     }
	
	@PostMapping("/signup")
	public String signUp(@RequestBody UserDto dto) {
		return userService.signUp(dto);
	}
	
	@PostMapping("/signin")
	public String signIn(@RequestParam String mail,String password) {
		return userService.signIn(mail,password);
	}
	@PostMapping("/sendMail")
	public String sendMail(@RequestParam("to") String to, @RequestParam("textBody") String textBody,
			@RequestParam("topic") String topic) {
		return userService.sendEmail(to, textBody, topic);
	}
	
	

}


