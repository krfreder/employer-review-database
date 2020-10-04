package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.Identity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepository extends JpaRepository<Identity, Integer> {}
