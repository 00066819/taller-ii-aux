package com.sv.taller2.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.taller2.entities.User;
import com.sv.taller2.utils.Constants;
import com.sv.taller2.utils.UsersList;

@RestController
@RequestMapping(Constants.USER)
public class CreateUserCtrl {
	
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> createUser(@RequestBody User usuario) {
		UsersList.user.add(usuario);
		return UsersList.user;
	}

}
