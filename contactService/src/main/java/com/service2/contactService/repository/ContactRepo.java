package com.service2.contactService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service2.contactService.beans.Contacts;

public interface ContactRepo extends JpaRepository<Contacts, Integer> {

	List<Contacts> findByUserId(Integer userId); // One user can have many contacts

}
