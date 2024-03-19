package com.inthi.security.controller;

import com.inthi.security.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @PostMapping("/user/create")
    public void create(@RequestBody RegisterRequest request){
        userService.create(request);


    }
}
