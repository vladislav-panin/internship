package com.hits.iternship.mapper;

import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.dto.position.CreatePositionTypeDto;
import com.hits.iternship.dto.position.PositionsListDto;
import com.hits.iternship.dto.position.PositionsListForOneCompany;
import com.hits.iternship.dto.position.PositionsTypesAllDto;
import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.position.PositionEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class PositionsMapper {
    private final ModelMapper modelMapper;

    public PositionsTypesAllDto toPositionsTypesAllDto(PositionEntity positionEntity) {
        return Objects.isNull(positionEntity) ? null :
                modelMapper.map(positionEntity, PositionsTypesAllDto.class);
    }


    public CreatePositionTypeDto toCreatePositionTypeDto(PositionEntity positionEntity) {
        return Objects.isNull(positionEntity) ? null :
                modelMapper.map(positionEntity, CreatePositionTypeDto.class);
    }

    public PositionEntity toPositionEntity(CreatePositionTypeDto createPositionTypeDto) {
        return Objects.isNull(createPositionTypeDto) ? null :
                modelMapper.map(createPositionTypeDto, PositionEntity.class);
    }

    public PositionsListDto toPositionsListDto(PositionEntity positionEntity)
    {
        return Objects.isNull(positionEntity) ? null :
                modelMapper.map(positionEntity, PositionsListDto.class);
    }

    public PositionsListForOneCompany toPositionsListForOneCompany(PositionEntity positionEntity)
    {
        return Objects.isNull(positionEntity) ? null :
                modelMapper.map(positionEntity, PositionsListForOneCompany.class);
    }


}
