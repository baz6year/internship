package com.example.KyrgyzLingo.mapper;

import com.example.KyrgyzLingo.dto.UserRequest;
import com.example.KyrgyzLingo.dto.UserResponse;
import com.example.KyrgyzLingo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserMapper {
    User toUser(UserRequest userRequest);
    UserResponse toResponse(User user);
    List<UserResponse> toResponses(List<User> users);
}
