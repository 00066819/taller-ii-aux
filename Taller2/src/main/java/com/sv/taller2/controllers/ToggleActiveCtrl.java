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
public class ToggleActiveCtrl {

	@PatchMapping(value = "/toggle-active", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> cambiarEstado() {
		return new ResponseEntity<String>("Status cambaido con exito!", HttpStatus.OK);

	}

}
