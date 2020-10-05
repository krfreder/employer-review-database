package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.models.Search;
import com.company.employerreviewdatabase.respositories.CultureRepository;
import com.company.employerreviewdatabase.respositories.IdentityRepository;
import com.company.employerreviewdatabase.respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping("search")
public class SearchController extends AbstractBaseController{

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CultureRepository cultureRepository;

    @Autowired
    private IdentityRepository identityRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public SearchController() {
        columnChoices.put("all", "All");
//        columnChoices.put("jobTitle", "Job Title");
//        columnChoices.put("company", "Company");
        columnChoices.put("culture", "Culture");
        columnChoices.put("identity", "Identity");
    }

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm){
        Iterable<Job> jobs;
        if (searchTerm.toLowerCase().equals("all") || searchTerm.equals("")){
            jobs = jobRepository.findAll();
        } else {
            jobs = Search.findByColumnAndValue(searchType, searchTerm, jobRepository.findAll());
        }
        model.addAttribute("columns", columnChoices);
        model.addAttribute("title", "Jobs with " + columnChoices.get(searchType) + ": " + searchTerm);
        model.addAttribute("jobs", jobs);

        return "search";
    }

}
