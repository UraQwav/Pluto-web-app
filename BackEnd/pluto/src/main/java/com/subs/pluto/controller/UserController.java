package com.subs.pluto.controller;
import com.subs.pluto.entity.PlUsers;
import com.subs.pluto.entity.PlUsersType;
import com.subs.pluto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/sign-up")
    PlUsers signUpUser(@RequestBody PlUsers plUsers){
        plUsers.setPlUsersType(new PlUsersType(new BigDecimal(1)));
        plUsers = userService.registrationUser(plUsers);
        return plUsers;
    }
    @PostMapping("/sign-in")
    PlUsers signInUser(@RequestBody PlUsers plUsers){
        return userService.getUserByLoginAndPassword(plUsers.getEmail(), plUsers.getPassword());
    }

}
