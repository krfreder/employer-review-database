package com.company.employerreviewdatabase.models;

public class UserDTO {
    // TODO: 9/7/2020 add validation checks 
    private String username;

    private String password;

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
