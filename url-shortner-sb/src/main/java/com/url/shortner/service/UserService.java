package com.url.shortner.service;

import com.url.shortner.dtos.LoginRequest;
import com.url.shortner.models.User;
import com.url.shortner.security.jwt.JwtAuthenticationResponse;

public interface UserService {

    User registerUser(User user);

    JwtAuthenticationResponse authenticateUser(LoginRequest loginRequest);
}
