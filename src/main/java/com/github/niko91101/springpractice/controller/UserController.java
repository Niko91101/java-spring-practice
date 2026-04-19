package com.github.niko91101.springpractice.controller;

import com.github.niko91101.springpractice.model.User;
import com.github.niko91101.springpractice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public String postUser(@RequestBody User user) {
        return userService.addUser(user);
    }

}
