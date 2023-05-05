package com.sv.taller2.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.taller2.entities.User;
import com.sv.taller2.utils.Constants;
import com.sv.taller2.utils.UsersList;

@RestController
@RequestMapping(Constants.USER)
public class AllUsersCtrl {
	
	private static List<User> user = UsersList.user;

	@GetMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> showAll() {
		
		return user;

	}

}
