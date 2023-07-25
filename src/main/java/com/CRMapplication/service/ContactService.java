package com.CRMapplication.service;

import java.util.List;

import com.CRMapplication.entity.Contact;


public interface ContactService {



	public void createContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long contactId);

	
}
