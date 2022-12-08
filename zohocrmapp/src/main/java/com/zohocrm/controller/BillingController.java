package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.GenerateBill;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;


@Controller
public class BillingController {
	
	@Autowired
	private BillingService billservice;
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id")long id, Model model) {
		Contact contact=contactservice.getContactById(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
	}
	@RequestMapping("/saveBill")
	public String saveBilling(@ModelAttribute("bill")GenerateBill bill, Model model) {
		billservice.saveOneBill(bill);
		model.addAttribute("bill", bill);
		return"Bill_info";
	}
	@RequestMapping("/listAllBill")
	public String listAllBill(Model model) {
		List<GenerateBill> Bill = billservice.findAllBill();
		model.addAttribute("Bill", Bill);
		return"Bill_list";
		
	}
}
