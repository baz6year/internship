package com.example.KyrgyzLingo.service;

import com.example.KyrgyzLingo.dto.UserRequest;
import com.example.KyrgyzLingo.dto.UserResponse;
import com.example.KyrgyzLingo.entity.User;

import java.util.List;

public interface UserService {
        User getUserById(Long id);
        List<UserResponse> getAllUsers();
        User updateUser(Long id, UserRequest request);
        void deleteUser(Long id);
        void changeLevel(Long userId, String newLevel);
}
