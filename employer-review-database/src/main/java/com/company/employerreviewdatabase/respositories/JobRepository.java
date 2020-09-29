package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.Job;
import com.company.employerreviewdatabase.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface JobRepository extends JpaRepository<Job, Integer> {

//    public Job findByJobTitle(String jobTitle);

}
