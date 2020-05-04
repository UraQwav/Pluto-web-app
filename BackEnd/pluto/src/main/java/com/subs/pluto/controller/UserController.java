package com.subs.pluto.controller;
import com.subs.pluto.entity.User;
import com.subs.pluto.entity.UserType;
import com.subs.pluto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://192.168.1.105:8081",maxAge = 10000)
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
        user.setUserType(new UserType(1l));
        userService.registrationUser(user);
    }
    @GetMapping("/getAll")
    List<User> getAll(){
        return userService.getAll();
    }
}
