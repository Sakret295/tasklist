package ru.mcc.rsa.iso.tasklist.service.impl;

import org.springframework.stereotype.Service;
import ru.mcc.rsa.iso.tasklist.service.AuthService;
import ru.mcc.rsa.iso.tasklist.web.dto.auth.JwtRequest;
import ru.mcc.rsa.iso.tasklist.web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
