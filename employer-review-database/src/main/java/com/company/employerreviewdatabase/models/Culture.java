package com.company.employerreviewdatabase.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
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

//    toString
    @Override
    public String toString() {
        return "Culture{" +
                "descriptor='" + descriptor + '\'' +
                '}';
    }
}
