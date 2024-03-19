package com.inthi.security.service;

import com.inthi.security.controller.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void create(RegisterRequest request);
}
