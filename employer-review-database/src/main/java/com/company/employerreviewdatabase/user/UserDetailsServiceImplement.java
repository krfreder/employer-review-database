package com.company.employerreviewdatabase.user;

import com.company.employerreviewdatabase.models.User;
import com.company.employerreviewdatabase.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImplement implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
//todo delete UserExistsException and replace all with UsernameNotFoundException
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Unfortunately " + username + " does not exist in our system.");
        }

        return new org.springframework.security.core.userdetails.User
                (user.getUsername(),
                        user.getPassword(),
                        user.getEnabled(),
                        /*accountNonExpired*/ true,
                        /*credentialsNonExpired*/ true,
                        /*accountNonLocked*/ true,
                        getGrantedAuthorities(user.getUserRoles()));
    }
// iterates through user roles and provides a string to be read by AccessDecisionManager to grant or deny access
    private static List<GrantedAuthority> getGrantedAuthorities (List<String> roles) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return grantedAuthorities;
    }

}
