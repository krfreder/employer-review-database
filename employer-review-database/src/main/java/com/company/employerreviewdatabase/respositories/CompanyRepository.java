package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

//    public Company findByCompany(String company);

}
