package com.service1.userService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service1.userService.beans.Contacts;
import com.service1.userService.beans.User;
import com.service1.userService.repo.UserRepo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	@Autowired
	ContactsFeignClient feignClient; //replace RestTemplate

	@Autowired
	RestTemplate restTemplate;

	@CircuitBreaker(name = "userService", fallbackMethod = "getUserByIdFallBack")
	public User getUserById(Integer userId) {
		User user = repo.findById(userId).get();

		// List<Contacts> contacts = restTemplate.getForObject("http://contacts-ms/contacts/" + userId, List.class);
		List<Contacts> contacts = feignClient.getSpecificContact(userId);

		System.out.println(contacts);

		user.setContacts(contacts);

		return user;
	}

	public User getUserByIdFallBack(Integer userId, Throwable t) {
		System.out.println("Our services are currently unavailable. Please try later :(");
		return new User();
	}

}
