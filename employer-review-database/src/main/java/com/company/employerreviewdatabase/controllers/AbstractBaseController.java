package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.User;
import com.company.employerreviewdatabase.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

public abstract class AbstractBaseController {

    @Autowired
    UserService userService;

    protected static final String MESSAGE_KEY = "message";
// principal represents the login ID, if its not null returns name, if is null returns null
    @ModelAttribute("user")
    public User getLoggedInUser(Principal principal) {
        if(principal != null)
            return userService.findByUsername(principal.getName());
        return null;
    }

}
