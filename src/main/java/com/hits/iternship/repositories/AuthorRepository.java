package com.hits.iternship.repositories;

import com.hits.iternship.entities.comments.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    List<AuthorEntity> findAll();

    List<AuthorEntity> findAuthorEntitiesByImage(String image);

    List<AuthorEntity> findAuthorEntitiesByAuthorId(Integer authorId);
}
