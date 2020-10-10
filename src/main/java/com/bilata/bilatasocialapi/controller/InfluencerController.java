package com.bilata.bilatasocialapi.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin()
public class InfluencerController {
    @RequestMapping(value = "/influencer", method = RequestMethod.GET)
    public String getInfluencer() {
        return "Welcome!";
    }
}