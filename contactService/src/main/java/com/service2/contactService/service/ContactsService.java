package com.service2.contactService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service2.contactService.beans.Contacts;
import com.service2.contactService.repository.ContactRepo;

@Service
public class ContactsService {
	
	@Autowired
	ContactRepo repo;
	
	public List<Contacts> getContactsByUserId(Integer userId) {
		
		return repo.findByUserId(userId);
	}

}
