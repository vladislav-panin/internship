package com.hits.iternship.dto.students;
import com.hits.iternship.dto.interview.InterviewsDto;
import com.hits.iternship.dto.contacts.ContactsShort;
import lombok.Data;

import java.util.List;
@Data
public class StudentDto {
    String id;

    String name;

    String image;

    String position;

    List<ContactsShort> contacts;

    List<InterviewsDto> interviews;

}
