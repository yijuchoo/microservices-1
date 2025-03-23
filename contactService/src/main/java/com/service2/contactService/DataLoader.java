package com.service2.contactService;

import org.springframework.stereotype.Component;

import com.service2.contactService.beans.Contacts;
import com.service2.contactService.repository.ContactRepo;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

	private final ContactRepo contactsRepository;

	public DataLoader(ContactRepo contactsRepository) {
		this.contactsRepository = contactsRepository;
	}

	@PostConstruct // As soon as application starts, the data will be loaded
	public void loadDummyData() {
		// Create and save dummy contacts
		Contacts contact1 = new Contacts(1, "email1@example.com", "1234567890", 1);
		Contacts contact2 = new Contacts(2, "email2@example.com", "0987654321", 1);
		Contacts contact3 = new Contacts(3, "email3@example.com", "0123456789", 1);
		Contacts contact4 = new Contacts(4, "email4@example.com", "6789012345", 2);
		Contacts contact5 = new Contacts(5, "email5@example.com", "5432109876", 2);
		Contacts contact6 = new Contacts(6, "email6@example.com", "6587744523", 2);
		Contacts contact7 = new Contacts(7, "email7@example.com", "6598766322", 3);
		Contacts contact8 = new Contacts(8, "email8@example.com", "8887744566", 3);
		Contacts contact9 = new Contacts(9, "email9@example.com", "9998855522", 3);
		Contacts contact10 = new Contacts(10, "email10@example.com", "0187441125", 4);

		contactsRepository.save(contact1);
		contactsRepository.save(contact2);
		contactsRepository.save(contact3);
		contactsRepository.save(contact4);
		contactsRepository.save(contact5);
		contactsRepository.save(contact6);
		contactsRepository.save(contact7);
		contactsRepository.save(contact8);
		contactsRepository.save(contact9);
		contactsRepository.save(contact10);

		System.out.println("Dummy data loaded successfully.");
	}

}
