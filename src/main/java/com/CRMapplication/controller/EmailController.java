package com.CRMapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRMapplication.dto.Email;
import com.CRMapplication.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	@RequestMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
		return"compose_email";
	}
	@RequestMapping("/triggerEmail")
    public String triggerEmail(Email email ,Model model) {
    	emailService.sendEmail(email.getEmail(), email.getSubject(), email.getContent());
    	model.addAttribute("msg", "Email Sent");
    	return "compose_email";
    	
    	
    }
}
