package com.sv.taller2.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sv.taller2.entities.User;

public class UsersList {

	public static List<User> user = new ArrayList<>();

	static {
		user.add(new User(1, "Arekusu", "123", "arekusu@gmail.com", new Date(), true, "admin"));
		user.add(new User(2, "Salva", "123", "salva@gmail.com", new Date(), true, "admin"));
		user.add(new User(3, "Armando", "123", "armando@gmail.com", new Date(), true, "admin"));
		user.add(new User(4, "Joel", "123", "joel@gmail.com", new Date(), true, "admin"));
	}
	
}
