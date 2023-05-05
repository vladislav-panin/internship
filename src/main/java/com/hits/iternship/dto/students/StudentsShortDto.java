package com.hits.iternship.dto.students;

import lombok.Data;

import java.util.Date;
@Data
public class StudentsShortDto {

     String id;
     String name;

     String status;

      Date lastActivity;
}
