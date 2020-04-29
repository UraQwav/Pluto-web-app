package com.subs.pluto.controller;
import com.subs.pluto.entity.Users;
import com.subs.pluto.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/user")
public class UsersControler {
    @Autowired
    private final UsersService usersService;

    public UsersControler(UsersService usersService) {
        this.usersService = usersService;
    }
    @PostMapping("/registration")
    void signUpUser(@RequestBody Users Users){
        usersService.registerUser(Users);

    }
    @GetMapping("/getAll")
    List<Users> getAll(){
        return usersService.getAll();
    }
}
