package com.hits.iternship.entities.comments;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "comments")
public class CommentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String interviewId;

    //List<AuthorEntity> authors;

    Date timestamp;

    String text;
}
