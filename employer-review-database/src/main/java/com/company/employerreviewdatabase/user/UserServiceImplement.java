package com.company.employerreviewdatabase.user;

import com.company.employerreviewdatabase.models.User;
import com.company.employerreviewdatabase.models.UserDTO;
import com.company.employerreviewdatabase.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
// checks if username exists, if the username exists - presents error message, if not - saves user to database w/encoded pw
    @Transactional
    @Override
    public User saveUser(UserDTO userDTO) throws UserExistsException {
        User userExists = userRepository.findByUsername(userDTO.getUsername());

        if (userExists != null)
            throw new UserExistsException("Unfortunately " + userDTO.getUsername() + " is not available. Please choose another.");

        User newUser = new User(
          userDTO.getUsername(),
          passwordEncoder.encode(userDTO.getPassword()));
//          userDTO.getJobs());
        userRepository.save(newUser);

        return newUser;
    }

    @Override
    public User findByUsername(String username) { return userRepository.findByUsername(username); }

}
