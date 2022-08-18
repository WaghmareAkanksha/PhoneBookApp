package com.Akanksha.PhoneBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Akanksha.PhoneBookApp.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
