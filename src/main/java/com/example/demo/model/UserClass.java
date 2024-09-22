package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class UserClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userPassword;
}
