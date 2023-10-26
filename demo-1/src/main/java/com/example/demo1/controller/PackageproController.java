package com.example.demo1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo1.dto.PackageproDto;
import com.example.demo1.modal.Packagepro;

import com.example.demo1.service.PackageproService;

@RestController
public class PackageproController {
	@Autowired
	PackageproService packageproService;
	@PostMapping("/saveorups")
	public	boolean saveOrUp(@RequestBody  PackageproDto packagedto) {
		return packageproService.saveOrUp(packagedto);
		
	}
	@GetMapping("/getAlls") 
	 public List<Packagepro>getAllUser(){
		 return packageproService.getAllUser();
	
	}
}
	