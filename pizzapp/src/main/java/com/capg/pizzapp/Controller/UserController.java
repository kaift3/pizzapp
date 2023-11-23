package com.capg.pizzapp.Controller;

import com.capg.pizzapp.Entity.User;
import com.capg.pizzapp.Service.UserService;
import com.capg.pizzapp.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/createuser")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
