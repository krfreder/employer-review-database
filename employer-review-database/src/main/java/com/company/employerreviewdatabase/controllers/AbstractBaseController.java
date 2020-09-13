package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractBaseController {

    @Autowired
    UserService userService;

}
