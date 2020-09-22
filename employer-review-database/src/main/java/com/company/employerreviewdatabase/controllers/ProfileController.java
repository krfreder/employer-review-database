package com.company.employerreviewdatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping(value = "profile")
    public String index() {
        return "profile";
    }

}
