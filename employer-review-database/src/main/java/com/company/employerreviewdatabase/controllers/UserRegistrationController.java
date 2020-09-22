package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.UserDTO;
import com.company.employerreviewdatabase.user.UserExistsException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class UserRegistrationController extends AbstractBaseController {

    @GetMapping(value = "register")
    public String registerUser(Model model) {
        model.addAttribute(new UserDTO());
        model.addAttribute("title", "Register");
        return "register";
    }

    @PostMapping(value = "register")
    public String saveUser(@ModelAttribute @Valid UserDTO userDTO, Errors errors) {
        if (errors.hasErrors())
            return "register";

        try {
            userService.saveUser(userDTO);
        } catch (UserExistsException userExistsException) {
            errors.rejectValue("username", "username.alreadyexists", userExistsException.getMessage());
            return "register";
        }

        return "login";
    }

    @GetMapping(value = "login")
    public String loginUser(Model model, Principal principal, String error, String logout) {
        if (principal != null)
            return "profile";
        if (error != null)
            model.addAttribute(MESSAGE_KEY, "danger|The username or password entered is invalid");
        if (logout != null) {
            model.addAttribute(MESSAGE_KEY, "info|You have logged out");
        }
        return "login";
    }
}


