package com.inthi.security.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manager")
public class ManagerController {
    @GetMapping
    public String get(){
        return "get: manager controller";
    }
    @PostMapping
    public String post(){
        return "post: manager controller";
    }
    @PutMapping
    public String put(){
        return "put: manager controller";
    }
    @DeleteMapping
    public String delete(){
        return "delete: manager controller";
    }
}
