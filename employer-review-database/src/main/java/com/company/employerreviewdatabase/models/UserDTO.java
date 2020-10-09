package com.company.employerreviewdatabase.models;

//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotBlank;

public class UserDTO {
// variable declarations
    @NotBlank(message = "Please enter a username")
    private String username;

    @NotBlank(message = "Please enter a password")
    private String password;

    @NotBlank(message = "Please re-enter your password")
    private String passwordMatch;

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
// password check method
    private void checkPasswordForRegistration() {
        if(!getPassword().equals(passwordMatch)) {
            passwordMatch = null;
        }
    }

}
