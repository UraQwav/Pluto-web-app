package com.subs.pluto.services;

import com.subs.pluto.entity.Users;

import java.util.List;

public interface UsersService {
    void registerUser(Users Users);
    List<Users> getAll();
}

