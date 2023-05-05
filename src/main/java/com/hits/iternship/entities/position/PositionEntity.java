package com.hits.iternship.entities.position;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "positions")
public class PositionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;


    String name;

    int plan;

    int taken;

    //CompanyEntity companies;
}
