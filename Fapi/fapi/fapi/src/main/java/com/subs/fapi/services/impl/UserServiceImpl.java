package com.subs.fapi.services.impl;

import com.subs.fapi.model.User;
import com.subs.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    private final RestTemplate restTemplate;

    public UserServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public User saveUser(User user) {
        user.setPassword(String.valueOf(user.getPassword().hashCode()));
        return this.restTemplate.postForObject(backendServerUrl + "user/sign-up", user, User.class);
    }
    @Override
    public User signUser(User user) {
        user.setPassword(String.valueOf(user.getPassword().hashCode()));
        return this.restTemplate.postForObject(backendServerUrl + "user/sign-in", user, User.class);
    }
    @Override
    public User[] getall() {
        return this.restTemplate.getForObject(backendServerUrl + "/user/getallusers", User[].class);
    }
    @Override
    public User delete(User user)
    {
        return this.restTemplate.postForObject(backendServerUrl + "user/delete", user, User.class);
    }
}
