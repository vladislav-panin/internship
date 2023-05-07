package com.hits.iternship.dto.position;

import com.hits.iternship.dto.students.StudentsShortDto;
import lombok.Data;

import java.util.List;


// 1 компания - много позиций
@Data
public class CompanyPositionsTypeDto {



    String positionTypeDtoId;

    int plan;

    int taken;

    String name;

    //  CompanyShortDto company; - это поле не нужно, запрос уже включает в себя айдишник компании

    List<StudentsShortDto> studentsShort;
}
