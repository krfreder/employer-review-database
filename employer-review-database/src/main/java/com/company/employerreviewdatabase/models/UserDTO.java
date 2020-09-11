package com.company.employerreviewdatabase.models;

import javax.validation.constraints.NotBlank;

public class UserDTO {

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

    public void setPassword(String password) { this.password = password; }

    public String getPasswordMatch() { return passwordMatch; }

    public void setPasswordMatch(String passwordMatch) { this.passwordMatch = passwordMatch; }
// To String
    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", passwordMatch='" + passwordMatch + '\'' +
                '}';
    }
}
