package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Company company;

//    private String jobTitle;

    private int salary;

//    @ManyToMany
//    private List<Company> companies = new ArrayList<>();

    public Job() {};

    public Job(Company company, int salary) {
        this.company = company;
//        this.jobTitle = jobTitle;
        this.salary = salary;
    }
//    public Job(List<Company> companies, String jobTitle, int salary) {
//        this.companies = companies;
//        this.jobTitle = jobTitle;
//        this.salary = salary;
//    }


//    getters and setters

    public Company getCompany() { return company; }

    public void setCompany(Company company) { this.company = company; }

//    public String getJobTitle() { return jobTitle; }
//
//    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

//    public List<Company> getCompanies() { return companies; }
//
//    public void setCompanies(List<Company> companies) { this.companies = companies; }

//    equals, hashcode, toString

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Job job = (Job) o;
//        return getSalary() == job.getSalary() &&
//                Objects.equals(getJobTitle(), job.getJobTitle()) &&
//                Objects.equals(getCompanies(), job.getCompanies());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), getJobTitle(), getSalary(), getCompanies());
//    }
//
//    @Override
//    public String toString() {
//        return "Job{" +
//                "jobTitle='" + jobTitle + '\'' +
//                ", salary=" + salary +
//                ", companies=" + companies +
//                '}';
//    }

}
