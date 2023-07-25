package com.CRMapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRMapplication.entity.Contact;
import com.CRMapplication.entity.Lead;
import com.CRMapplication.service.ContactService;
import com.CRMapplication.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/viewCreateLeadPage")
	public String viewCreateLeadPage() {
		
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.createLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
    public String converLead(@RequestParam("leadId") long leadId,Model model) {
		Lead leadById = leadService.getLeadById(leadId);
		System.out.println(leadById.getFirstName());
		Contact contact=new Contact();
		contact.setFirstName(leadById.getFirstName());
		contact.setLastName(leadById.getLastName());
		contact.setEmail(leadById.getEmail());
		contact.setMobile(leadById.getMobile());
		contact.setSource(leadById.getSource());
		contactService.createContact(contact);
		model.addAttribute("contact", contact);
		
		leadService.deleteLeadById(leadId);
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_AllContacts";
		
    	
    }
	@RequestMapping("/listAllLeads")
	public String getAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
	    model.addAttribute("leads", leads);
		return "list_allLeads";
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("leadId") long leadId,Model model) {
		Lead lead = leadService.getLeadById(leadId);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
}
