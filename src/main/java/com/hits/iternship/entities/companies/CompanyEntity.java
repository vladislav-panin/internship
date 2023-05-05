package com.hits.iternship.entities.companies;

import com.hits.iternship.entities.contacts.ContactsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

// вроде найз - разбор с комментов
@Data
@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String name;

    String description;

    String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    RepresentativesEntity representatives;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    ContactsEntity contacts;

}
