package com.subs.pluto.services.impl;

import com.subs.pluto.entity.qwert;
import com.subs.pluto.repository.UserRepository;
import com.subs.pluto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(qwert qwert) {
        userRepository.save(qwert);
    }

    @Override
    public List<qwert> getAll() {

        return userRepository.findAllBy();

    }
}
