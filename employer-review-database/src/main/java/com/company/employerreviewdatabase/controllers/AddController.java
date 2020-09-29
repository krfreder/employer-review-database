package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Company;
import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.respositories.CompanyRepository;
import com.company.employerreviewdatabase.respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class AddController extends AbstractBaseController{

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private JobRepository jobRepository;

//    @GetMapping(value = "add")
//    public String add() {
//        return "add";
//    }

//    @GetMapping("add")
//    public String displayAddForm(Model model) {
//        model.addAttribute("title", "Add Job");
//        model.addAttribute(new Job());
//        model.addAttribute("company", companyRepository.findAll());
//        return "add";
//    }

    @PostMapping("add")
    public String processAddForm(@ModelAttribute @Valid Job newJob, Model model, @RequestParam int companyId) {

        Optional<Company> result = companyRepository.findById(companyId);
        Company company = result.get();
        newJob.setCompany(company);

        jobRepository.save(newJob);

        return "redirect:";
    }

    @GetMapping("add")
    public String displayAddForm(Model model) {
        model.addAttribute("title", "Add Job");
        model.addAttribute(new Job());
        model.addAttribute(new Company());
        return "add";
    }
//
//    @PostMapping("add")
//    public String processAddForm(@ModelAttribute @Valid Job newJob, @ModelAttribute @Valid Company newCompany, Model model) {
//
//        jobRepository.save(newJob);
//        companyRepository.save(newCompany);
//
//        return "redirect:";
//    }

}
