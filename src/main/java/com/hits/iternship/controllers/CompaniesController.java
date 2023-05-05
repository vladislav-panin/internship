package com.hits.iternship.controllers;

import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompaniesController {


    CompanyRepository companyRepository;

    @GetMapping("/easy")
    public String easyMapping() {
        return "easy";
    }


    @GetMapping()
    public CompanyShortDto getAllCompanies()
    {
        return
    }




}
