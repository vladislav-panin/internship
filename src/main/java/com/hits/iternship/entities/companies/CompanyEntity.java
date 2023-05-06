package com.hits.iternship.entities.companies;


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
    Integer company_id;

    String name;

    String description;

    String image;

    Integer plan;

    Integer taken;

  /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @Column(insertable=false, updatable=false)
    RepresentativesEntity representatives;
/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @Column(insertable=false, updatable=false)
    ContactsEntity contacts;
*/
}
