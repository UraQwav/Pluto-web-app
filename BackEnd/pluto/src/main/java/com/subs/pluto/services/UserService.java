package com.subs.pluto.services;

import com.subs.pluto.entity.qwert;

import java.util.List;

public interface UserService {
    void registerUser(qwert qwert);
    List<qwert> getAll();
}

