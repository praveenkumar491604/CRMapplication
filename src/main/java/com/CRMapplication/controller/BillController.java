package com.CRMapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRMapplication.entity.Bill;
import com.CRMapplication.entity.Contact;
import com.CRMapplication.service.BillService;
import com.CRMapplication.service.ContactService;


@Controller
public class BillController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillService billService;
	@RequestMapping("/generateBill")
	public String viewGenerateBillPage(@RequestParam("contactId") long contactId,Model model) {
		Contact contact = contactService.getContactById(contactId);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	@RequestMapping("/saveBill")
	public String saveBill(Bill bill,Model model) {
		billService.createBill(bill);
		model.addAttribute("bill", bill);
		return "bill_info";
		
	}

}
