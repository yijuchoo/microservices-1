package com.service2.contactService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service2.contactService.beans.Contacts;
import com.service2.contactService.repository.ContactRepo;
import com.service2.contactService.service.ContactsService;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

	@Autowired
	ContactsService service;

	@Autowired
	ContactRepo repo;

	@GetMapping("/{userId}")
	public List<Contacts> getUserById(@PathVariable("userId") Integer userId) {
		return service.getContactsByUserId(userId); // Get contacts by userId
	}

	@GetMapping("/all")
	public List<Contacts> getUserById() {
		return (List<Contacts>) repo.findAll(); // Get all contacts
	}

}
