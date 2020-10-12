package com.bilata.bilatasocialapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.service.SignUpService;

@RestController
public class SignUpController {
	@Autowired
	SignUpService signUpService;

	@RequestMapping(value = "/api/users/signup", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {

		signUpService.creatUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/users/{username}").buildAndExpand(user.getUsername()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

}