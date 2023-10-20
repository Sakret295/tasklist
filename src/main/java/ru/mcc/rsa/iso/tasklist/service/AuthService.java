package ru.mcc.rsa.iso.tasklist.service;

import ru.mcc.rsa.iso.tasklist.web.dto.auth.JwtRequest;
import ru.mcc.rsa.iso.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
