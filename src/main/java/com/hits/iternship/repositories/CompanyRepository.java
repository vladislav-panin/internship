package com.hits.iternship.repositories;

import com.hits.iternship.entities.companies.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<CompanyEntity, String> {



}
