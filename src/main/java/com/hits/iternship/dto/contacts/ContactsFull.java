package com.hits.iternship.dto.contacts;

import lombok.Data;

import java.util.List;

//вроде найз
@Data
public class ContactsFull {

    private String id;

    private String name;

    private String position;

    List<ContactsShort> contactsShort;
}
