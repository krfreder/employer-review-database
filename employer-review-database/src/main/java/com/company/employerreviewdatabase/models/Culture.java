package com.company.employerreviewdatabase.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

@Entity
public class Culture extends AbstractEntity{

    @NotBlank(message = "Please enter a Cultural Touchstone to be added.")
    private String descriptor;

    @ManyToMany(mappedBy = "cultures")
    private List<Job> jobs = new ArrayList<>();

    public Culture() {}

    public Culture(String descriptor, List<Job> jobs) {
        this.descriptor = descriptor;
        this.jobs = jobs;
    }

//    getters and setters

    public String getDescriptor() { return descriptor; }

    public void setDescriptor(String descriptor) { this.descriptor = descriptor; }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }


//    private List<String> cultureDescriptors = Arrays.asList(
//        "Competitive",
//        "Collaborative",
//        "Heavily-Managed",
//        "Self-Directed",
//        "Formal",
//        "Relaxed",
//        "Promote-Outside",
//        "Promote-Within",
//        "Progressive",
//        "Conservative",
//        "Unclear-Communication",
//        "Clear-Communication"
//    );
//
//    @OneToMany(mappedBy = "culture_id")
//    private List<Job> jobs = new ArrayList<>();
//
//    public Culture() {};
//
//    public Culture(List<String> cultureDescriptors) {
//        this.cultureDescriptors = cultureDescriptors;
//    }

//    getters and setters
//    public List<String> getCultureDescriptors() { return cultureDescriptors; }
//
//    public void setCultureDescriptors(List<String> cultureDescriptors) { this.cultureDescriptors = cultureDescriptors; }
//
//    public List<Job> getJobs() { return jobs; }
//
//    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
}
