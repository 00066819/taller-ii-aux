package com.sv.taller2.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sv.taller2.controllers.AllUsersCtrl;

import com.sv.taller2.utils.Constants;
import com.sv.taller2.utils.UsersList;
import com.sv.taller2.entities.User;

@RestController
@RequestMapping(Constants.USER)
public class OneUserCtrl {

	@GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Stream<User> showOne(@PathVariable("id") int id) {

		return UsersList.user.stream()
				.filter(b -> b.getID() == id);

	}
}
