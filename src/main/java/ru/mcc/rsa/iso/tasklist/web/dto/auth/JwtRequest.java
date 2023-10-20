package ru.mcc.rsa.iso.tasklist.web.dto.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JwtRequest {

    @NotNull(message = "username mast by not null")
    private String username;

    @NotNull(message = "password mast by not null")
    private String password;

}
