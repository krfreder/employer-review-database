package com.company.employerreviewdatabase.user;

import com.company.employerreviewdatabase.models.User;
import com.company.employerreviewdatabase.models.UserDTO;

public interface UserService {
//    saves new user object unless the username already exists
    public User saveUser(UserDTO userDTO) throws UserExistsException;
    public User findByUsername(String username);

}
