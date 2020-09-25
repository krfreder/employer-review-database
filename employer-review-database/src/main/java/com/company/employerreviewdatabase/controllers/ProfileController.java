package com.company.employerreviewdatabase.controllers;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
>>>>>>> registration
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping(value = "profile")
    public String index() {
        return "profile";
    }

<<<<<<< HEAD
=======
    @GetMapping(value = "search")
    public String search() {
        return "search";
    }

    @GetMapping(value = "add")
    public String add() {
        return "add";
    }

    @GetMapping(value = "profile/myjobs")
    public String myJobs() {
        return "myjobs";
    }
>>>>>>> registration

}
