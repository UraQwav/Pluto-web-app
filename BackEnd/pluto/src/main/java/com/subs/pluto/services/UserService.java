package com.subs.pluto.services;

import com.subs.pluto.entity.User;

import java.util.List;

public interface UserService {
    void registrationUser(User user);
    List<User> getAll();
}

