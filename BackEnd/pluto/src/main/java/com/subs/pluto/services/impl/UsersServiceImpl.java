package com.subs.pluto.services.impl;

import com.subs.pluto.entity.Users;
import com.subs.pluto.entity.UsersType;
import com.subs.pluto.repository.UsersRepository;
import com.subs.pluto.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsersServiceImpl implements UsersService {
    @Autowired
    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void registerUser(Users Users) {
        usersRepository.save(Users);
    }

    @Override
    public List<Users> getAll() {

        return usersRepository.findAllBy();

    }
}
