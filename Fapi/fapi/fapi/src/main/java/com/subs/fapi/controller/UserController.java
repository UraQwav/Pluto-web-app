package com.subs.fapi.controller;

import com.subs.fapi.model.User;
import com.subs.fapi.model.UserType;
import com.subs.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/sign-up")
    void signUpUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
