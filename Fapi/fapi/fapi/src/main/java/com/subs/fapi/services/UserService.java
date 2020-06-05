package com.subs.fapi.services;

import com.subs.fapi.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    User signUser(User user);
    User saveUser(User user);
    User[] getall();
    User delete(User user);
}

