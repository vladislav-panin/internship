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

@Component
@RequiredArgsConstructor
public class CompaniesMapper {
    private final ModelMapper modelMapper;

    @PostConstruct
    private void setup() {
        modelMapper.createTypeMap(CompanyEntity.class, CompanyFullDto.class)
                .addMapping(source -> source.getRepresentatives(),
                        CompanyFullDto::setRepresentativesDto)
                .addMapping(source -> source.getContacts(),
                        CompanyFullDto::setContactsFull);

        modelMapper.createTypeMap(CompanyEntity.class, CompanyShortDto.class);


        modelMapper.createTypeMap(RepresentativesEntity.class, RepresentativesDto.class)
                .addMapping(source -> source.getContacts(),
                        RepresentativesDto::setContactsShort);

    }

}
