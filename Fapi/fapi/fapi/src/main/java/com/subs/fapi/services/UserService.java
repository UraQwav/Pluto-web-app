package com.subs.fapi.services;

import com.subs.fapi.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<User> saveUser(User user);
}

