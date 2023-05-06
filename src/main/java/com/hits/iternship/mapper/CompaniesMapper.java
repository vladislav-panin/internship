package com.hits.iternship.mapper;

import com.hits.iternship.dto.companies.CompanyFullDto;
import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.dto.companies.RepresentativesDto;

import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.companies.RepresentativesEntity;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.*;

import static java.util.stream.Collectors.toList;


@Component
@RequiredArgsConstructor
public class CompaniesMapper {
    private final ModelMapper modelMapper;



    public CompanyShortDto toCompanyShortDto(CompanyEntity companyEntity) {
        return Objects.isNull(companyEntity) ? null :
                modelMapper.map(companyEntity, CompanyShortDto.class);
    }


    public CompanyFullDto toCompanyFullDto(CompanyEntity companyEntity) {



        CompanyFullDto myCompanyDto = modelMapper.map(companyEntity,CompanyFullDto.class); // Тут лежит замапленное компани ентети, но с нулл по маппингу в плане представителей и контактов

/*

*/
        List<RepresentativesEntity> representativesEntityList = companyEntity.getRepresentatives();
        List<RepresentativesDto> representativesDtoList = new ArrayList<>();
        for(RepresentativesEntity oneRepEnt : representativesEntityList) {
            RepresentativesDto firstRepDto = modelMapper.map(oneRepEnt, RepresentativesDto.class);
            representativesDtoList.add(firstRepDto);

        } // тут вроде получилось замапить репрезентативитес и сложить в новый лист

        //CompanyFullDto myCompanyDto = modelMapper.map(companyEntity,CompanyFullDto.class);

      //  myCompanyDto.setRepresentativesDto(representativesDtoList); // ВАЖНЫЙ МОМЕНТ

        CompanyFullDto myCompanyDtoTest = myCompanyDto;
        myCompanyDtoTest.setRepresentativesDto(representativesDtoList);
        myCompanyDto.getRepresentativesDto();
        return myCompanyDto; // ЗАМАПИЛ В МАППИНГЕ
      /*  return Objects.isNull(companyEntity) ? null :
                modelMapper.map(companyEntity, CompanyFullDto.class);
                */

    }



    public RepresentativesDto toRepresentativesDto(RepresentativesEntity representativesEntity) {



        return Objects.isNull(representativesEntity) ? null :
                modelMapper.map(representativesEntity, RepresentativesDto.class);
    }
}
