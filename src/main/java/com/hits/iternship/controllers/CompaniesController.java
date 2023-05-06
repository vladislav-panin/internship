package com.hits.iternship.controllers;

import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.repositories.CompanyRepository;
import com.hits.iternship.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompaniesController {


    private final CompanyRepository companyRepository;

    private final CompanyService companyService;

    @GetMapping("/easy")
    public String easyMapping() {
        return "easy";
    }


    ///////////////////Методы добавления, которые не зеленые///////////////////////////////////////

    @PostMapping("/addCompany")
    public CompanyEntity addCompany(String name,String description, String image, Integer plan,Integer taken){

        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setName(name);
        companyEntity.setDescription(description);
        companyEntity.setImage(image);
        companyEntity.setPlan(plan);
        companyEntity.setTaken(taken);

        companyRepository.save(companyEntity);
        return companyEntity;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping()
    public List<CompanyShortDto> getAllCompanies() {
        return companyService.findAllCompanies();
    }

}
