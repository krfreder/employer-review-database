package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.models.Search;
import com.company.employerreviewdatabase.respositories.CultureRepository;
import com.company.employerreviewdatabase.respositories.IdentityRepository;
import com.company.employerreviewdatabase.respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("search")
public class SearchController{

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CultureRepository cultureRepository;

    @Autowired
    private IdentityRepository identityRepository;

    @GetMapping(value = "")
    public String search() {
        return "search";
    }

    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchValue){

        Iterable<Job> jobs = Search.findSearchValue(searchValue, jobRepository.findAll());

        model.addAttribute("jobs", jobs);

        return "search";
    }

}
