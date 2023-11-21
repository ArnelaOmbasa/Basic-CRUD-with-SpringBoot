package com.prep.prep.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prep.prep.core.model.User;
import com.prep.prep.core.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @GetMapping("/get-by-id")
    public Optional<User> getById(String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/get-all-users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete")
    public void deleteUser(String id) {
        userService.deleteUser(id);
    }

    @PutMapping("/update")
    public User updateUser(User user) {
        return userService.updateUser(user);
    }

}
