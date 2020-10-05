package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Identity;
import com.company.employerreviewdatabase.respositories.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class IdentityController {

    @Autowired
    private IdentityRepository identityRepository;

    @GetMapping(value = "add/identity")
    public String displayAddIdentityForm(Model model) {
        model.addAttribute(new Identity());
        model.addAttribute("title", "Add Marker");
        return "identity";
    }

    @PostMapping(value = "add/identity")
    public String processAddCultureForm(@ModelAttribute @Valid Identity newIdentity, Errors errors) {

        if(errors.hasErrors()) {
            return "identity";
        }
        identityRepository.save(newIdentity);
        return "profile";
    }


}
