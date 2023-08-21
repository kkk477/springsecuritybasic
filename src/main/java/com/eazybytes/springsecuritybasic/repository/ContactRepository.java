package com.eazybytes.springsecuritybasic.repository;

import com.eazybytes.springsecuritybasic.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
