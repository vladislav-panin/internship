package com.hits.iternship.entities.companies;


import com.hits.iternship.entities.contacts.ContactsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

//вроде найз - разбор с комментов
@Data
@Entity
@Table(name = "representatives")
public class RepresentativesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer representative_id;

    String name;

    String position;

    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companies_id", referencedColumnName = "company_id") // Первое имя - хз что такое, второе - имя айди в классе репрезентетивитес
    CompanyEntity companyEntity;
*/

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "representatives_id", referencedColumnName = "representative_id")
    List<ContactsEntity> contacts;
}
