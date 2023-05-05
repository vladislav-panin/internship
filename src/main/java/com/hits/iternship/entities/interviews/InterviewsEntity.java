package com.hits.iternship.entities.interviews;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "interviews")
public class InterviewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String studentId;

   // List<CompanyEntity> companies;

    String position;

    String status;

    //List<CommentsEntity> comments;
}
