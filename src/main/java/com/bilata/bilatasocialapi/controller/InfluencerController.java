package com.bilata.bilatasocialapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.service.UserService;

@RestController
@CrossOrigin()
public class InfluencerController {
	
	// create influencer service 
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/influencer", method = RequestMethod.GET)
	public String getInfluencer() {
		return "Welcome!";
	}

	@RequestMapping(value = "/api/users/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> displayListOfAllInfluencer(@RequestParam("userName") String username) {

		List<User> users = userService.findByUsername(username);

		if (users == null || users.isEmpty()) {

			return new ResponseEntity<>("User not found!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
<<<<<<< HEAD
	
	@RequestMapping(value = "/api/influencers/{id}/followers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
=======

	@RequestMapping(value = "/api/clients/{company_name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getClientByName(@PathVariable("company_name") String company_name) {
        
       List<User> client = userService.findByCompanyName(company_name);
    	
        if (client == null) {
            return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<User>>(client, HttpStatus.OK);
    }


	@RequestMapping(value = "/api/users/{id}/followers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
>>>>>>> 9e95474644966a8bfb96e52efc733d71b3f6ef9e
	public ResponseEntity<Object> displayFollowersOfInfluencer(@PathVariable("id") int id) {

		List<Follower> followers = userService.displayByUserId(id);
		// follower model required - influencer service - influencer rep

		if (followers == null || followers.isEmpty()) {

			return new ResponseEntity<>("User not found!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(followers, HttpStatus.OK);
	}
}