package com.bilata.bilatasocialapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.repository.UserRepository;
import com.bilata.bilatasocialapi.service.userService;

@RestController
@CrossOrigin()
public class InfluencerController {
	
	@Autowired
	UserRepository influncerDao;
	
	@RequestMapping(value = "/influencer", method = RequestMethod.GET)
	public String getInfluencer() {
		return "Welcome!";
	}

	@RequestMapping(value = "/api/users/{userName}", method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> displayListOfAllInfluencer(@PathVariable("userName") String username) {

//		List of influencer contains --> the following
		/*
		 * influencer user name, UserDAO getUserByUserName number of followers, number
		 * of likes,
		 */
		User influencer = influncerDao.findByUsername(username).isPresent() ? influncerDao.findByUsername(name).get() : null;

		if (influencer == null) {

			return new ResponseEntity<>("User not found!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(influencer, HttpStatus.OK);
	}
}