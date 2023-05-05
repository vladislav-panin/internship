package com.hits.iternship.dto.position;

import com.hits.iternship.dto.companies.CompanyShortDto;
import lombok.Data;

import java.util.List;

// вроде найз кроме комментов


// 1 позиция - много компаний
@Data
public class PositionTypeDto {

    String id;

    String name;

    int plan;

    int taken;

    List<CompanyShortDto> companies;
}
