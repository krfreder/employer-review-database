package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Culture;
import com.company.employerreviewdatabase.respositories.CultureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CultureController {

    @Autowired
    private CultureRepository cultureRepository;

//    public String culture() {
//        return "culture";
//    }

    @GetMapping(value = "add/culture")
    public String displayAddCultureForm(Model model) {
        model.addAttribute(new Culture());
        model.addAttribute("title", "Add Descriptor");
        return "culture";
    }

    @PostMapping(value = "add/culture")
    public String processAddCultureForm(@ModelAttribute @Valid Culture newCulture, Errors errors) {

        if(errors.hasErrors()) {
            return "culture";
        }
        cultureRepository.save(newCulture);
        return "profile";
    }


}
