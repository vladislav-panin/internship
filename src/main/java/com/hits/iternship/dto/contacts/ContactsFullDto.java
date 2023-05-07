package com.hits.iternship.dto.contacts;

import lombok.Data;

import java.util.List;

//вроде найз
@Data
public class ContactsFullDto {

    private String contactId;

    private String name;

    private String position;

    private String contactType;

    private String value;

  //  List<ContactsShortDto> contactsShortDto;
}
