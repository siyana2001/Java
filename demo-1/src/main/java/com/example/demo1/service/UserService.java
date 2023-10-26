package com.example.demo1.service;

import java.util.List;
import java.util.Optional;

import com.example.demo1.dto.UserDto;
import com.example.demo1.modal.User;

public interface UserService {
	  public boolean Savorupdate(UserDto dto);
	  public boolean Savorupdate(int id);
	  public boolean deleteUserById(int id);
      public int softDeleteById(int id);
	  
	  public List<User>getAllUser();
	  public Optional<User>getById(int id);
	public String signUp(UserDto dto);
	public String signIn(String mail,String password);
public String sendEmail(String to, String textBody,String topic) ;

//List<Object[]> mergeUserDataAndPackagePro(Integer userId);
	
}

	