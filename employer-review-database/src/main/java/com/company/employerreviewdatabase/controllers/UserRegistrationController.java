package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.UserDTO;
import com.company.employerreviewdatabase.user.UserExistsException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
//import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping(value = "login")
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

        return "redirect:/";
    }

    @GetMapping
    public String loginUser(Model model, Principal principal, String error, String logout) {
        if (principal != null)
            return "redirect:/home";
        if (error != null)
            model.addAttribute(MESSAGE_KEY, "danger|The username or password entered is invalid");
        if (logout != null) {
            model.addAttribute(MESSAGE_KEY, "info|You have logged out");
        }
        return "login";
    }
}
//    private static final Logger createLog = LoggerFactory.getLogger(UserRegistrationController.class);
//
////    trims blank space from inputted strings, labeling inputs with only blank space as Null (handydandy!)
//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//    }
//
//    @GetMapping("register")
//    public String registerUser(@ModelAttribute UserDTO userDTO, Model model) {
//        model.addAttribute("user", userDTO);
//        // TODO: 9/7/2020 add "register" into SecurityConfig .antMatchers, ensure is routed to proper html file
//        return "register";
//    }
//// when controller is called, creates a log storing the data inputted by user as a string
//    @PostMapping("register")
//    public String save(@Valid UserDTO userDTO, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "register";
//        }
//        createLog.info(">> userDTO : {}" + userDTO.toString());
//        return "redirect:";
//    }


