package com.hits.iternship.dto.companies;


import com.hits.iternship.dto.contacts.ContactsShort;
import lombok.Data;

import java.util.List;

//вроде найз
@Data
public class RepresentativesDto {

    Integer representative_id;

    String name;

    String position;

    List<ContactsShort> contactsShort;
}
