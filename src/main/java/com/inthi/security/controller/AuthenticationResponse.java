package com.inthi.security.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {

    private String token;
}
