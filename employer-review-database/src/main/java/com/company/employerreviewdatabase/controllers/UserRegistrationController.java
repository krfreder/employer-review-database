package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "login")
public class UserRegistrationController {

    @GetMapping("register")
    public String registerUser(@ModelAttribute UserDTO userDTO, Model model) {
        model.addAttribute("user", userDTO);
        // TODO: 9/7/2020 add "register" into SecurityConfig .antMatchers, ensure is routed to proper html file
        return "login/register";
    }

    @PostMapping("register")
    public void save() {

    }

}
