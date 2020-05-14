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
        return this.restTemplate.postForObject(backendServerUrl + "user/sign-up", user, User.class);
    }
    @Override
    public User signUser(String login, String password) {
        String path = "user/getByEmailAndPassword/{email}/{password}/signIn";
        return this.restTemplate.getForObject(backendServerUrl + path, User.class, login,password);
    }

}
