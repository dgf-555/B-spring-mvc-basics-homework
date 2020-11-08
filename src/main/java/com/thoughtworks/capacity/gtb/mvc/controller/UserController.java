package com.thoughtworks.capacity.gtb.mvc.controller;

import com.thoughtworks.capacity.gtb.mvc.bo.User;
import com.thoughtworks.capacity.gtb.mvc.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/register")
    public ResponseEntity get_userList(){
        return ResponseEntity.ok(UserService.returnUserList());
    }

    @PostMapping("/register")
    public ResponseEntity register_a_user(@RequestBody @Valid User user){
        UserService.addUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestParam(value = "username",required = true) String username, @RequestParam(value = "password",required = true) String password){
        return ResponseEntity.ok(UserService.returnUser(username,password));
    }



}