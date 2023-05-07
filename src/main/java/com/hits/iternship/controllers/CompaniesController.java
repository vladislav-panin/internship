package com.hits.iternship.controllers;

import com.hits.iternship.dto.companies.CompanyFullDto;
import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.dto.position.*;
import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.companies.RepresentativesEntity;
import com.hits.iternship.repositories.CompanyRepository;
import com.hits.iternship.repositories.ContactsRepository;
import com.hits.iternship.repositories.RepresentativeRepository;
import com.hits.iternship.service.CompanyService;
import com.hits.iternship.service.PositionService;
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

    private final PositionService positionService;

    @GetMapping("/easy")
    public String easyMapping() {
        return "easy";
    }


    ///////////////////Методы добавления, которые не зеленые///////////////////////////////////////
    private final CompanyRepository companyRepository;

    private final RepresentativeRepository representativeRepository;

    private final ContactsRepository contactsRepository;

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
        try {
            List<RepresentativesEntity> repEnt = companyEntity.getRepresentatives();// лист наших представителей


            for (RepresentativesEntity oneRepEnt : repEnt
            ) {
                oneRepEnt.getContacts().stream().map(contactsRepository::save).toList(); // сохранение контактов представителей
            }
        }catch(Exception ex){
            companyRepository.save(companyEntity);
            return companyEntity;
        }


        companyEntity.getRepresentatives().stream().map(representativeRepository::save).toList();// сохранение представителей

        companyEntity.getContacts().stream().map(contactsRepository::save).toList(); // сохранение контактов компании

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

    @GetMapping("/{companyId}")
    public List<CompanyFullDto> getCompanyById(@PathVariable Integer companyId){
        return companyService.findCompanyById(companyId);
    }

    @GetMapping("/{companyId}/positions")
    //public PositionsAllFonOneCompanyDto getPositionsForOneCompany(@PathVariable Integer companyId) {
    public PositionsAllFonOneCompanyDto getPositionsForOneCompany(@PathVariable Integer companyId) {

        List<PositionsListForOneCompany> positionsListDtos =   positionService.findPositionsForOneCompany(companyId); //Вернулся лист дтошек ПОЗИТИОНС ЛИСТ

        PositionsAllFonOneCompanyDto pos = new PositionsAllFonOneCompanyDto();
        pos.setPlan(15);
        pos.setTaken(5);
        pos.setPositions(positionsListDtos);

/*
        PositionsAllFonOneCompanyDto positionsAllFonOneCompanyDto = new PositionsAllFonOneCompanyDto();

        return positionsAllFonOneCompanyDto;

 */
        return pos;
    }

}
