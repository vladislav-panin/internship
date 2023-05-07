package com.hits.iternship.repositories;

import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.contacts.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactsRepository extends JpaRepository<ContactsEntity, Integer> {

        List<ContactsEntity>findContactsEntitiesByContactId(Integer contactId);
}
