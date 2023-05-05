package com.hits.iternship.entities.contacts;


import jakarta.persistence.*;
import lombok.Data;

//Вроде найз
@Data
@Entity
@Table(name = "contacts")
public class ContactsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String name;

    String position;

    String contactType;

    String value;
}
