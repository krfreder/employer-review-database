package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Company extends AbstractEntity {

    private String company;

    private String location;

    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Job> jobs = new ArrayList<>();

    public Company() {};

    public Company(String company, String location, List<Job> jobs) {
        this.company = company;
        this.location = location;
        this.jobs = jobs;
    }

//    getters, setters

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }

//    equals, hashcode, toString

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Company company1 = (Company) o;
//        return Objects.equals(getCompany(), company1.getCompany()) &&
//                Objects.equals(getLocation(), company1.getLocation()) &&
//                Objects.equals(getJobs(), company1.getJobs());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), getCompany(), getLocation(), getJobs());
//    }
//
//    @Override
//    public String toString() {
//        return "Company{" +
//                "company='" + company + '\'' +
//                ", location='" + location + '\'' +
//                ", jobs=" + jobs +
//                '}';
//    }

}
