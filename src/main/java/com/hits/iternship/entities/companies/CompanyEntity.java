package com.hits.iternship.entities.companies;


import com.hits.iternship.entities.contacts.ContactsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

// вроде найз - разбор с комментов
@Data
@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer company_id;

    String name;

    String description;

    String image;

    Integer plan;

    Integer taken;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "companies_id", referencedColumnName = "company_id") // Первое имя - хз что такое, второе - имя айди в классе репрезентетивитес
    List<RepresentativesEntity> representatives;
////////////////////////////////// ниже пошли изменения
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "companies_id", referencedColumnName = "company_id")
    List<ContactsEntity> contacts;
/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @Column(insertable=false, updatable=false)
    ContactsEntity contacts;
*/
}
