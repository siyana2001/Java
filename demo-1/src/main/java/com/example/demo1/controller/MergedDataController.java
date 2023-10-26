package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.service.MergedDataService;
@RestController
@RequestMapping("/merge")
public class MergedDataController {
	  @Autowired
	    private MergedDataService mergedDataService;

	    @GetMapping
	    public List<Object[]> getMergedData() {
	        return mergedDataService.getMergedData();
	    }
}
