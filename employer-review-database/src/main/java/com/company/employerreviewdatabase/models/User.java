package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User extends AbstractEntity {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotNull
    private Boolean isEnabled = true;

    public User() {}
// validation messages within user object (can be moved to variable declaration)
    public User(@NotBlank String username, @NotBlank String password) {
        if (username == null || username.length() == 0)
            throw new IllegalArgumentException("Please enter your username");
        if (password== null || password.length() == 0)
            throw new IllegalArgumentException("Please enter your password");

        this.username = username;
        this.password = password;
    }
//    when a new user is made, assign them user role and return info to use
    public List<String> getUserRoles() {
        ArrayList<String> userRoles = new ArrayList<>();
        userRoles.add("ROLE_USER");
        return userRoles;
    }
// getters, setters, equals, hashcode, toString
    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Boolean getEnabled() { return isEnabled; }

    public void setEnabled(Boolean enabled) { isEnabled = enabled; }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public int hashCode() { return Objects.hash(getUsername()); }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

}
