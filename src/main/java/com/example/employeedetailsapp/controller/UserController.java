package com.example.employeedetailsapp.controller;

import com.example.employeedetailsapp.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class UserController {
    
    @PostMapping("/api/users")
    public User createUser(@RequestBody User user) {
        
        System.out.println("Received user details");
        System.out.println("Name : " + user.getName());
        System.out.println("Email : " + user.getEmail());
        
        return user;
    }
    
}
