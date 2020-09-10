package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "login")
public class UserRegistrationController {

    private static final Logger createLog = LoggerFactory.getLogger(UserRegistrationController.class);

//    trims blank space from inputted strings, labeling inputs with only blank space as Null (handydandy!)
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("register")
    public String registerUser(@ModelAttribute UserDTO userDTO, Model model) {
        model.addAttribute("user", userDTO);
        // TODO: 9/7/2020 add "register" into SecurityConfig .antMatchers, ensure is routed to proper html file
        return "login/register";
    }
// when controller is called, creates a log storing the data inputted by user as a string
    @PostMapping("register")
    public String save(@Valid UserDTO userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        createLog.info(">> userDTO : {}" + userDTO.toString());
        return "redirect:/login";
    }

}
