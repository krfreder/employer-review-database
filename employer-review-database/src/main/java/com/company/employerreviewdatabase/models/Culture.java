package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Culture extends AbstractEntity{

    public static void main(String[] args) {
        ArrayList<String> cultureDescriptors = new ArrayList<String>();
        cultureDescriptors.add("Competitive");
        cultureDescriptors.add("Collaborative");
        cultureDescriptors.add("Heavily-Managed");
        cultureDescriptors.add("Self-Directed");
        cultureDescriptors.add("Formal");
        cultureDescriptors.add("Relaxed");
        cultureDescriptors.add("Promote-Outside");
        cultureDescriptors.add("Promote-Within");
        cultureDescriptors.add("Progressive");
        cultureDescriptors.add("Conservative");
        cultureDescriptors.add("Unclear-Communication");
        cultureDescriptors.add("Clear-Communication");
    }

    @ManyToMany(mappedBy = "culture")
    private List<Job> jobs = new ArrayList<>();

//    getters and setters
    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
}
