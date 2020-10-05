package com.company.employerreviewdatabase.models;

//import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class UserDTO{
// variable declarations
    @NotNull(message = "Please enter a username")
    private String username;

    @NotNull(message = "Please enter a password")
    private String password;

    @NotNull(message = "Please re-enter your password")
    private String passwordMatch;

//    @OneToMany
//    @JoinColumn(name = "user_id")
//    @OneToOne(cascade = CascadeType.ALL)
//    private List<Job> jobs = new ArrayList<>();


    public UserDTO() {}
// Getters and Setters
    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
        checkPasswordForRegistration();
    }

    public String getPasswordMatch() { return passwordMatch; }

    public void setPasswordMatch(String passwordMatch) {
        this.passwordMatch = passwordMatch;
        checkPasswordForRegistration();
    }

//    public List<Job> getJobs() { return jobs; }

//    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
// password check method
    private void checkPasswordForRegistration() {
        if(!getPassword().equals(passwordMatch)) {
            passwordMatch = null;
        }
    }

}
