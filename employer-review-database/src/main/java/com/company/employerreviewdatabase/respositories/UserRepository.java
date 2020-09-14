package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);

}
