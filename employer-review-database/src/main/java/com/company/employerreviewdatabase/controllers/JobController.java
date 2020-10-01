package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class JobController extends AbstractBaseController{

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("add")
    public String displayAddForm(Model model) {
        model.addAttribute(new Job());
        model.addAttribute("title", "Add Job");
        return "add";
    }

    @PostMapping("add")
    public String processAddForm(@ModelAttribute @Valid Job newJob, Errors errors) {

        if(errors.hasErrors()) {
            return "add";
        }

        jobRepository.save(newJob);

        return "myjobs";
    }


}
