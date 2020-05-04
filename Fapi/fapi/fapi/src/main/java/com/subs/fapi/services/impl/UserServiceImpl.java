package com.subs.fapi.services.impl;

import com.subs.fapi.model.User;
import com.subs.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public ResponseEntity<User> saveUser(User user) {
        RestTemplate restTemplate = new RestTemplate();
        User savedUser = restTemplate.postForEntity(backendServerUrl + "user/sign-up", user, User.class).getBody();
        return ResponseEntity.ok().body(savedUser);
    }
}
