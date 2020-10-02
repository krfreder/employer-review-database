package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;


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



    public Job() { }

    public Job(String jobTitle, String company, String location, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.location = location;
        this.salary = salary;
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

//    to String
    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
