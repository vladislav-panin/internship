package com.hits.iternship.service;

import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.mapper.CompaniesMapper;
import com.hits.iternship.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    private final CompaniesMapper companiesMapper;


    public List<CompanyShortDto> findAllCompanies(){
        return companyRepository
                .findAll()
                .stream().map(companiesMapper::toCompanyShortDto)
                .collect(Collectors.toList());
    }
}
