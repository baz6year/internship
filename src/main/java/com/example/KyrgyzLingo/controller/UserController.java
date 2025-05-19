package com.example.KyrgyzLingo.controller;

import com.example.KyrgyzLingo.dto.UserRequest;
import com.example.KyrgyzLingo.dto.UserResponse;
import com.example.KyrgyzLingo.entity.User;
import com.example.KyrgyzLingo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/update")
    public User updateUser(@PathVariable Long id, @RequestBody UserRequest request) {
        return userService.updateUser(id, request);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user.getId());
    }






}
