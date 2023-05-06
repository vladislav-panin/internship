package com.hits.iternship.repositories;

import com.hits.iternship.entities.companies.RepresentativesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepresentativeRepository extends JpaRepository<RepresentativesEntity, Integer> {


}
