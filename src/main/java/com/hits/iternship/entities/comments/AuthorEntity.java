package com.hits.iternship.entities.comments;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comments_authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer authorId;

    String name;

    String image;
}
