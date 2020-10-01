package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {}
