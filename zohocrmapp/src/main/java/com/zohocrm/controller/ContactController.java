package com.zohocrm.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	private ContactService contactservice;
	
	public ContactController(ContactService contactservice) {
		super();
		this.contactservice = contactservice;
	}


	@RequestMapping("/contactlist")
	public String getAllContact(Model model) {
		List<Contact> contact = contactservice.getAllContacts();
		model.addAttribute("contact", contact);
		return"contact_listLead";
	}
		
}
