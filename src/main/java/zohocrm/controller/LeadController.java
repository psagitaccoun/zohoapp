package zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrm.entities.Contact;
import zohocrm.entities.Lead;
import zohocrm.services.A;
import zohocrm.services.C;

@Controller
public class LeadController {
     @Autowired
	private C c;
     
	@Autowired
	private A a;
	
	@RequestMapping("/")
	public String viewOneLead() {
	return "view_lead";
	}
	
	@RequestMapping("/saveOneLead")
	public String saveOneLead(@ModelAttribute Lead lead,ModelMap model) {
		a.saveOneLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = a.getOneLead(id);
		Contact contact= new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		c.saveOneContact(contact);
		
		a.deleteOneLead(id);
		List<Contact> list = c.listAllContacts();
		model.addAttribute("stored", list);
		return "search_contact_result";
		}
	
	@RequestMapping("/listAll")
	public String listAll(ModelMap model) {
		List<Lead> list = a.listAll();
		model.addAttribute("stored", list);
		return "search_lead_result";
		}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead lead = a.getOneLead(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	
	
	
	
}
