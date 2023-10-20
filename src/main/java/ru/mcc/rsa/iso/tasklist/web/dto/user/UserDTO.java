package ru.mcc.rsa.iso.tasklist.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.domain.user.Role;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnCreate;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnUpdate;

import java.util.List;
import java.util.Set;

@Data
public class UserDTO {

    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must by not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name length must by smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String name;

    @NotNull(message = "Username must by not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "username length must by smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String username;

    @NotNull(message = "Password must by not null.", groups = {OnUpdate.class, OnCreate.class})
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "PasswordConfirmation must by not null.", groups = {OnCreate.class})
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String passwordConfirmation;

}
