package com.company.employerreviewdatabase.respositories;

import com.company.employerreviewdatabase.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    public Company findByCompany(String company);

}
