package com.hits.iternship.mapper;

import com.hits.iternship.dto.companies.CompanyFullDto;
import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.dto.companies.RepresentativesDto;

import com.hits.iternship.entities.companies.CompanyEntity;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
@RequiredArgsConstructor
public class CompaniesMapper {
    private final ModelMapper modelMapper;



    public CompanyShortDto toCompanyShortDto(CompanyEntity companyEntity) {
        return Objects.isNull(companyEntity) ? null :
                modelMapper.map(companyEntity, CompanyShortDto.class);
    }

    /*
    public CompanyFullDto toCompanyFullDto(CompanyEntity companyEntity) {
        return Objects.isNull(companyEntity) ? null :
                modelMapper.map(companyEntity, CompanyFullDto.class);
    }
*/
}
