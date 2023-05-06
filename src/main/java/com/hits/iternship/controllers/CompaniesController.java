package com.hits.iternship.controllers;

import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.companies.RepresentativesEntity;
import com.hits.iternship.repositories.CompanyRepository;
import com.hits.iternship.repositories.RepresentativeRepository;
import com.hits.iternship.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompaniesController {




    private final CompanyService companyService;

    @GetMapping("/easy")
    public String easyMapping() {
        return "easy";
    }


    ///////////////////Методы добавления, которые не зеленые///////////////////////////////////////
    private final CompanyRepository companyRepository;

    private final RepresentativeRepository representativeRepository;

    @PostMapping("/addCompany")
    public CompanyEntity addCompany(@RequestBody CompanyEntity companyEntity){
        /*
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setName(name);
        companyEntity.setDescription(description);
        companyEntity.setImage(image);
        companyEntity.setPlan(plan);
        companyEntity.setTaken(taken);
        companyEntity.setRepresentatives(representatives);
        */
        companyEntity.getRepresentatives().stream().map(representativeRepository::save).toList();
        companyRepository.save(companyEntity);
        return companyEntity;
    }


    @PostMapping("/addRepresentative")
    public RepresentativesEntity addRepresentative(@RequestBody RepresentativesEntity representativesEntity ){
    /*
        RepresentativesEntity representativesEntity = new RepresentativesEntity();
        representativesEntity.setName(name);
        representativesEntity.setPosition(position);
    */

        representativeRepository.save(representativesEntity);
        return representativesEntity;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping()
    public List<CompanyShortDto> getAllCompanies() {
        return companyService.findAllCompanies();
    }

}
