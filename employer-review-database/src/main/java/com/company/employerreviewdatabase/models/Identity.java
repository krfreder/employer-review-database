package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

@Entity
public class Identity extends AbstractEntity {

    private String gender;

    private String transgender;

    private String sexualOrientation;

    private String ageRange;

    private String ethnicity;

    private String abilityStatus;

    @ManyToMany(mappedBy = "identities")
    private List<Job> jobs = new ArrayList<>();

    public Identity() {}

    public Identity(String gender, String transgender, String sexualOrientation, String ageRange, String ethnicity, String abilityStatus, List<Job> jobs) {
        this.gender = gender;
        this.transgender = transgender;
        this.sexualOrientation = sexualOrientation;
        this.ageRange = ageRange;
        this.ethnicity = ethnicity;
        this.abilityStatus = abilityStatus;
        this.jobs = jobs;
    }

//    getters and setters
    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getTransgender() { return transgender; }

    public void setTransgender(String isTrans) { this.transgender = isTrans; }

    public String getSexualOrientation() { return sexualOrientation; }

    public void setSexualOrientation(String sexualOrientation) { this.sexualOrientation = sexualOrientation; }

    public String getAgeRange() { return ageRange; }

    public void setAgeRange(String ageRange) { this.ageRange = ageRange; }

    public String getEthnicity() { return ethnicity; }

    public void setEthnicity(String ethnicity) { this.ethnicity = ethnicity; }

    public String getAbilityStatus() { return abilityStatus; }

    public void setAbilityStatus(String abilityStatus) { this.abilityStatus = abilityStatus; }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }

//    toString
    @Override
    public String toString() {
        return "Identity{" +
                "gender='" + gender + '\'' +
                ", transgender='" + transgender + '\'' +
                ", sexualOrientation='" + sexualOrientation + '\'' +
                ", ageRange='" + ageRange + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", abilityStatus='" + abilityStatus + '\'' +
                '}';
    }
}
