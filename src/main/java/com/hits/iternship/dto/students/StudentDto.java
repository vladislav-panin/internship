package com.hits.iternship.dto.students;
import com.hits.iternship.dto.interview.InterviewsDto;
import com.hits.iternship.dto.contacts.ContactsShortDto;
import lombok.Data;

import java.util.List;
@Data
public class StudentDto {
    String id;

    String name;

    String image;

    String position;

    List<ContactsShortDto> contacts;

    List<InterviewsDto> interviews;

}
