package com.hits.iternship.dto.companies;

import com.hits.iternship.dto.contacts.ContactsFull;
import lombok.Data;

import java.util.List;

// вроде найз
@Data
public class CompanyFullDto {

    private String id;

    private String name;

    private String description;

    private String image;

    List<RepresentativesDto> representativesDto;

    List<ContactsFull> contactsFull;
}
