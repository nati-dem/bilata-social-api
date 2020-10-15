package com.bilata.bilatasocialapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bilata.bilatasocialapi.model.JwtRequest;
import com.bilata.bilatasocialapi.model.JwtResponse;
import com.bilata.bilatasocialapi.model.SignUpRequest;
import com.bilata.bilatasocialapi.service.AuthService;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	AuthService authService;

	@RequestMapping(value = "/api/signup", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody SignUpRequest user) throws Exception {
		return ResponseEntity.ok(authService.save(user));
	}

	@RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		//Javax validation / custom validation
		final String token = authService.authenticate(authenticationRequest);

		return ResponseEntity.ok(new JwtResponse(token));
	}

}
