package com.hits.iternship.dto.position;

import com.hits.iternship.dto.companies.CompanyShortDto;
import lombok.Data;

import java.util.List;

@Data
public class PositionsListDto {

    Integer positionId;
    String name;
    Integer plan;
    Integer taken;

    List<CompanyShortDto> companies;

}
