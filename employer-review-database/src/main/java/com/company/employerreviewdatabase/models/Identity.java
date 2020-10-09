package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToMany;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//import java.util.List;

@Entity
public class Identity extends AbstractEntity {

//    public static void main(String[] args) {
//        HashMap<String, List<String>> identifier = new HashMap<>();

//        identifier.put("gender", Arrays.asList("Female", "Genderqueer", "Male", "Non-Binary"));
//        identifier.put("transgender", Arrays.asList("Yes", "No", "Prefer not to answer"));
//        identifier.put("sexualOrientation", Arrays.asList("Bisexual", "Gay", "Lesbian", "Straight"));
//        identifier.put("ageRange", Arrays.asList("18-24", "25-34", "35-44", "45-54"));
//        identifier.put("ethnicity", Arrays.asList("Black/African American", "Hispanic/Latinx/Spanish", "Native American", "White"));
//        identifier.put("abilityStatus", Arrays.asList("Mental Disability", "Physical Disability", "Sensory Disability", "No Diagnosis"));
//    }


    @ManyToMany
    private List<Job> jobs = new ArrayList<>();

    public Identity() {};

//    public Identity(HashMap<String, List<String>> identifier, List<Job> jobs) {
//        List<String> gender = new ArrayList<>();
//        gender.add("Female");
//        identifier.put("gender", Arrays.asList("Female", "Genderqueer", "Male", "Non-Binary"));
//        identifier.put("transgender", Arrays.asList("Yes", "No", "Prefer not to answer"));
//        identifier.put("sexualOrientation", Arrays.asList("Bisexual", "Gay", "Lesbian", "Straight"));
//        identifier.put("ageRange", Arrays.asList("18-24", "25-34", "35-44", "45-54"));
//        identifier.put("ethnicity", Arrays.asList("Black/African American", "Hispanic/Latinx/Spanish", "Native American", "White"));
//        identifier.put("abilityStatus", Arrays.asList("Mental Disability", "Physical Disability", "Sensory Disability", "No Diagnosis"));
//        this.jobs = jobs;
//    }

    public Identity(HashMap<String, List<String>> identifier, List<Job> jobs) {
        List<String> gender = new ArrayList<>();
        gender.add("Female");
        identifier.put("gender", gender);
        List<String> transgender = new ArrayList<>();
        transgender.add("Yes");
        identifier.put("transgender", transgender);
        List<String> sexualOrientation = new ArrayList<>();
        sexualOrientation.add("Bisexual");
        identifier.put("sexualOrientation", sexualOrientation);
        List<String> ageRange = new ArrayList<>();
        ageRange.add("18-24");
        identifier.put("ageRange", ageRange);
        List<String> ethnicity = new ArrayList<>();
        ethnicity.add("Black/African American");
        identifier.put("ethnicity", ethnicity);
        List<String> abilityStatus = new ArrayList<>();
        abilityStatus.add("Mental Disability");
        identifier.put("abilityStatus", abilityStatus);
        this.jobs = jobs;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    //    private String gender;
//
//    private String transgender;
//
//    private String sexualOrientation;
//
//    private String ageRange;
//
//    private String ethnicity;
//
//    private String abilityStatus;
//
//    @ManyToMany(mappedBy = "identities")
//    private List<Job> jobs = new ArrayList<>();
//
//    public Identity() {}
//
//    public Identity(String gender, String transgender, String sexualOrientation, String ageRange, String ethnicity, String abilityStatus, List<Job> jobs) {
//        this.gender = gender;
//        this.transgender = transgender;
//        this.sexualOrientation = sexualOrientation;
//        this.ageRange = ageRange;
//        this.ethnicity = ethnicity;
//        this.abilityStatus = abilityStatus;
//        this.jobs = jobs;
//    }
//
////    getters and setters
//    public String getGender() { return gender; }
//
//    public void setGender(String gender) { this.gender = gender; }
//
//    public String getTransgender() { return transgender; }
//
//    public void setTransgender(String isTrans) { this.transgender = isTrans; }
//
//    public String getSexualOrientation() { return sexualOrientation; }
//
//    public void setSexualOrientation(String sexualOrientation) { this.sexualOrientation = sexualOrientation; }
//
//    public String getAgeRange() { return ageRange; }
//
//    public void setAgeRange(String ageRange) { this.ageRange = ageRange; }
//
//    public String getEthnicity() { return ethnicity; }
//
//    public void setEthnicity(String ethnicity) { this.ethnicity = ethnicity; }
//
//    public String getAbilityStatus() { return abilityStatus; }
//
//    public void setAbilityStatus(String abilityStatus) { this.abilityStatus = abilityStatus; }
//
//    public List<Job> getJobs() { return jobs; }
//
//    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
}
