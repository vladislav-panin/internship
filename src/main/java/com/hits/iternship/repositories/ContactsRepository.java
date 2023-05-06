package com.hits.iternship.repositories;

import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.contacts.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<ContactsEntity, Integer> {


}
