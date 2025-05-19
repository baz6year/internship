package com.example.KyrgyzLingo.mapper.Impl;

import com.example.KyrgyzLingo.dto.UserRequest;
import com.example.KyrgyzLingo.dto.UserResponse;
import com.example.KyrgyzLingo.entity.User;
import com.example.KyrgyzLingo.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public User toUser(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        return user;
    }

    @Override
    public UserResponse toResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setUsername(user.getUsername());
        userResponse.setPassword(user.getPassword());
        return userResponse;
    }

    @Override
    public List<UserResponse> toResponses(List<User> users) {
        List<UserResponse> userResponses = new ArrayList<>();

        for (User user : users) {
            userResponses.add(toResponse(user));
        }

        return userResponses;
    }
}
