package com.hits.iternship.dto.position;

import lombok.Data;

import java.util.List;

@Data
public class PositionsAllDto {
    Integer plan;

    Integer taken;

    List<PositionsListDto> positions;
}
