package com.subs.fapi.services;

import com.subs.fapi.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    User signUser(String login, String password);
    User saveUser(User user);
}

