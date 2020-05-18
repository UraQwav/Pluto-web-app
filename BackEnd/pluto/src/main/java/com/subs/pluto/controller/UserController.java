package com.subs.pluto.controller;
import com.subs.pluto.entity.User;
import com.subs.pluto.entity.UserType;
import com.subs.pluto.services.UserService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/sign-up")
    User signUpUser(@RequestBody User user){
        user.setUserType(new UserType(new BigDecimal(1)));
        user = userService.registrationUser(user);
        return user;
    }
    @PostMapping("/sign-in")
    User signInUser(@RequestBody User user){
        return userService.getUserByLoginAndPassword(user.getEmail(), user.getPassword());
    }

}
