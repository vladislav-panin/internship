package com.hits.iternship.dto.position;

import lombok.Data;

import java.util.List;

@Data
public class CreatePositionTypeDto {
    Integer positionId;
    String name;
    Integer plan;
    Integer taken;

    List<Integer> companiesId;
}
