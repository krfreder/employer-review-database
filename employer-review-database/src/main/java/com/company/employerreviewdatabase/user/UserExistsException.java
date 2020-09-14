package com.company.employerreviewdatabase.user;

public class UserExistsException extends Exception {
//    when called will display message stating username exists in database
    public UserExistsException(String message) {
        super(message);
    }

}
