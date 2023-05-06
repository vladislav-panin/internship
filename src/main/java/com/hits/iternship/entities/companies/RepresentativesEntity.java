package com.hits.iternship.entities.companies;


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
    Integer representative_id;

    String name;

    String position;
    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @Column(insertable=false, updatable=false)
    ContactsEntity contacts;
    */

}
