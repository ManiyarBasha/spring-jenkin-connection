package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class HelloController {
	
	

	    @GetMapping
	    public String greet() {
	        return "Hello, jenkins!";
	    }
	}


