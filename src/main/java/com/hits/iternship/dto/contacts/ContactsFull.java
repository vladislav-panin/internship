package com.hits.iternship.dto.contacts;

import lombok.Data;

//вроде найз
@Data
public class ContactsFull {

    private String id;

    private String name;

    private String position;

    ContactsShort contactsShort;
}
