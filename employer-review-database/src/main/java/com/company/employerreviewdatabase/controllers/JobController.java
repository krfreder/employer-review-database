package com.company.employerreviewdatabase.controllers;

import com.company.employerreviewdatabase.models.Culture;
import com.company.employerreviewdatabase.models.Identity;
import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.respositories.CultureRepository;
import com.company.employerreviewdatabase.respositories.IdentityRepository;
import com.company.employerreviewdatabase.respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class JobController extends AbstractBaseController{

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CultureRepository cultureRepository;

    @Autowired
    private IdentityRepository identityRepository;

    @GetMapping("add")
    public String displayAddForm(Model model) {
        model.addAttribute(new Job());
        model.addAttribute("title", "Add Job");
        model.addAttribute("cultures", cultureRepository.findAll());
        model.addAttribute("identities", identityRepository.findAll());
        return "add";
    }

    @PostMapping("add")
    public String processAddForm(@ModelAttribute @Valid Job newJob, Errors errors, @RequestParam List<Integer> cultures, @RequestParam List<Integer> identities) {

        if(errors.hasErrors()) {
            return "add";
        }

        List<Culture> cultureObjs = (List<Culture>) cultureRepository.findAllById(cultures);
        newJob.setCultures(cultureObjs);

        List<Identity> identityObjs = (List<Identity>) identityRepository.findAllById(identities);
        newJob.setIdentities(identityObjs);

        jobRepository.save(newJob);

        return "myjobs";
    }

    @GetMapping("view")
    public String viewAllJobs(Model model) {
        model.addAttribute("title", "Delete");
        model.addAttribute("jobs", jobRepository.findAll());
        return "view";
    }


    @PostMapping("view")
    public String deleteJob(int id) {
        Optional<Job> jobOptional = jobRepository.findById(id);

        if (jobOptional.isPresent()) {
            jobRepository.deleteById(id);
        }
        return "profile";
    }

    private void syncCultureAndIdentity(List<Integer> cultureIds, List<Culture> cultures, List<Integer> identityIds, List<Identity> identities) {
        if(cultureIds == null || identityIds == null)
            return;
        List<Culture> newCultures = cultureRepository.findAllById(cultureIds);
        cultures.removeIf(culture -> cultureIds.contains(culture.getId()));
        cultures.addAll(newCultures);

        List<Identity> newIdentities = identityRepository.findAllById(identityIds);
        identities.removeIf(identity -> identityIds.contains(identity.getId()));
        identities.addAll(newIdentities);
    }

}
