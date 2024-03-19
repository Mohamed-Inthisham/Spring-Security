package com.inthi.security.service.Impl;

import com.inthi.security.controller.RegisterRequest;
import com.inthi.security.model.Role;
import com.inthi.security.model.User;
import com.inthi.security.model.UserRepository;
import com.inthi.security.service.UserService;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Var;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public void create(RegisterRequest request) {
        var user= User.builder()
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(request.getRole())
                .build();

        userRepository.save(user);

    }
}
