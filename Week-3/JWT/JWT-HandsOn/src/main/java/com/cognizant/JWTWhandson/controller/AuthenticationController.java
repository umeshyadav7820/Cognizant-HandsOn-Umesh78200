package com.cognizant.JWTWhandson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.JWTWhandson.model.AuthenticationResponse;
import com.cognizant.JWTWhandson.security.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(Authentication authentication) {

        String username = authentication.getName();

        String token = jwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}