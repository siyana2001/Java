package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo1.repository.UserRepository;

@Service

public class MergedDataService {
	
	   @Autowired
	    private UserRepository userRepository;
	   
	public List<Object[]> getMergedData() {
		return userRepository. mergeUserAndPackageproData();
		
	}

}
