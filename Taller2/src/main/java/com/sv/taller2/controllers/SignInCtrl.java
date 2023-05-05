package com.sv.taller2.controllers;

import com.sv.taller2.utils.Constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.SIGN_IN)
public class SignInCtrl {

	@PostMapping(value = "/signin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> autenticar() {
		return new ResponseEntity<String>("Usuario autenticado con exito!", HttpStatus.OK);

	}
	
}
