package com.hits.iternship.entities.companies;

import com.hits.iternship.entities.contacts.ContactsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

//вроде найз - разбор с комментов
@Data
@Entity
@Table(name = "representatives")
public class RepresentativesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String name;

    String position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    ContactsEntity contacts;
}
