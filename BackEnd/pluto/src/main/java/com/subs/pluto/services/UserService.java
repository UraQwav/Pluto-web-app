package com.subs.pluto.services;

import com.subs.pluto.entity.PlUsers;

public interface UserService {
    PlUsers registrationUser(PlUsers plUsers);
    PlUsers getUserByLoginAndPassword(String userLogin, String userPassword);
}

