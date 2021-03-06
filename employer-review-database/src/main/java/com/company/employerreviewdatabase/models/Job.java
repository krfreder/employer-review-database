package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @NotBlank(message = "Please enter your Job Title.")
    private String jobTitle;

    @NotBlank(message = "Please enter the Company or Organization you work(ed) for.")
    private String company;

    @NotBlank(message = "Please enter the location of your role.")
    private String location;

    @Positive
    @Min(value = 4, message = "Please enter your yearly salary. If you work hourly, please estimate your yearly take home pay.")
    private int salary;

    @ManyToMany
    private List<Culture> cultures = new ArrayList<>();

    @ManyToMany
    private List<Identity> identities = new ArrayList<>();

    public Job() { }

    public Job(String jobTitle, String company, String location, int salary, List<Culture> cultures, List<Identity> identities) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.cultures = cultures;
        this.identities = identities;
    }

//    getters and setters

    public String getJobTitle() { return jobTitle; }

    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

    public List<Culture> getCultures() { return cultures; }

    public void setCultures(List<Culture> cultures) { this.cultures = cultures; }
// this might not be necessary?
    public void addCultures(Culture cultures) { this.cultures.add(cultures); }

    public List<Identity> getIdentities() { return identities; }

    public void setIdentities(List<Identity> identities) { this.identities = identities; }
//    this might not be necessary?
    public void addIdentities(Identity identities) { this.identities.add(identities); }


    //    to String
    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", cultures=" + cultures +
                ", identities=" + identities +
                '}';
    }
}
