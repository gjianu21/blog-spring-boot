package com.blog.blogspringboot.controllers;

import com.blog.blogspringboot.models.User;
import com.blog.blogspringboot.repositories.UserRepository;
import com.blog.blogspringboot.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        log.info("user with id {} was searched", id);
        return userRepository.getOne(id);
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        userRepository.saveAndFlush(user);
        log.info("user: {} was created", user.getUserName());
    }

    @PostMapping("/logIn/{userEmail}")
    public void logInUser(@RequestBody String userEmail) throws Exception {
        String message = userService.checkUserForLogIn(userEmail);
        log.info("user {} is now logged in", userEmail);
    }
}
