package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("home")
	public String hello() {
		return "hello";
	}
}
