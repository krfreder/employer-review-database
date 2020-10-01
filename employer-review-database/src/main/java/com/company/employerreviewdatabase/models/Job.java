package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;

@Entity
public class Job extends AbstractEntity {

    private String jobTitle;

    private String company;

    private String location;

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
