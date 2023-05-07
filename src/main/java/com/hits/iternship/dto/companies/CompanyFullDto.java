package com.hits.iternship.dto.companies;

import com.hits.iternship.dto.contacts.ContactsFullDto;
import lombok.Data;

import java.util.List;

// вроде найз
@Data
public class CompanyFullDto {

    private Integer companyId;

    private String name;

    private String description;

    private String image;

    //  private Integer plan;

    // private Integer taken;

    List<RepresentativesDto> representativesDto;

    List<ContactsFullDto> contactsFullDto;
}
