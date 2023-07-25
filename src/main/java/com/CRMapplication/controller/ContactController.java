package com.CRMapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRMapplication.entity.Contact;

import com.CRMapplication.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	@RequestMapping("/listAllContacts")
	public String getAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_AllContacts";
	}
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("contactId") long contactId,Model model) {
		Contact contact =contactService.getContactById(contactId);
		model.addAttribute("contact", contact);
		return "contact_info";
		
	}
}
