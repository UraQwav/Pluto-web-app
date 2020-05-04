package com.subs.fapi.controller;

import com.subs.fapi.model.User;
import com.subs.fapi.model.UserType;
import com.subs.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://192.168.1.105:4200",maxAge = 10000)
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/sign-up")
    void signUpUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
