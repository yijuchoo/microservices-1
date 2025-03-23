package com.service1.userService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service1.userService.beans.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
