package com.CRMapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRMapplication.entity.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long> {

}
