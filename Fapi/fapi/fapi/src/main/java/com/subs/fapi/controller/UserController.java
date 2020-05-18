package com.subs.fapi.controller;

import com.subs.fapi.model.Company;
import com.subs.fapi.model.User;
import com.subs.fapi.model.UserType;
import com.subs.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/sign-up")
    @ResponseBody User signUpUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @PostMapping("/sign-in")
    @ResponseBody User signInUser(@RequestBody User user){
        User savedUser = userService.signUser(user);
        return  savedUser;
    }


}
