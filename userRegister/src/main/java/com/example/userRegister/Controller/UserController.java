package com.example.userRegister.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.userRegister.Entity.UserEntry;
import com.example.userRegister.Service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserEntry user) {
       

        userService.registerUser(user);
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    
    }
     @GetMapping("/fetch")
    public ResponseEntity<UserEntry> fetchUser(@RequestParam String username) {
        UserEntry user = userService.getUserByUsername(username);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    
    
}
