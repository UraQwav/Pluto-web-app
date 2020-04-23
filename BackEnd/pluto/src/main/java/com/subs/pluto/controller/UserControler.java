package com.subs.pluto.controller;
import com.subs.pluto.entity.qwert;
import com.subs.pluto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/user")
public class UserControler {
    @Autowired
    private final UserService userService;

    public UserControler(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/registration")
    void signUpUser(@RequestBody qwert qwert){
        userService.registerUser(qwert);

    }
    @GetMapping("/getAll")
    List<qwert> getAll(){
        return userService.getAll();
    }
}
