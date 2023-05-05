package com.sv.taller2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.taller2.utils.Constants;

@RestController
@RequestMapping(Constants.USER)
public class ChangePassCtrl {
	
	@PatchMapping(value = "/change-password", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> autenticar() {
		return new ResponseEntity<String>("Contrasenia cambaida con exito!", HttpStatus.OK);

	}

}
