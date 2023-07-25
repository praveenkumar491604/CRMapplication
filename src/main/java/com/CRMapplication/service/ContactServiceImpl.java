package com.CRMapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMapplication.entity.Contact;

import com.CRMapplication.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void createContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(long contactId) {
		Optional<Contact> findById = contactRepository.findById(contactId);
		Contact contact = findById.get();
		return contact;
	}
	





}
