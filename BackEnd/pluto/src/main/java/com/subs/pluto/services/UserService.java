package com.subs.pluto.services;

import com.subs.pluto.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User registrationUser(User user);
    User getUserByLoginAndPassword(String userLogin,String userPassword);
}

