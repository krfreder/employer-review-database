package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {

    public Job findByJobTitle(String jobTitle);

}
