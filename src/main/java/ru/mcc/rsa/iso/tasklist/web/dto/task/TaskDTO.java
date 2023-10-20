package ru.mcc.rsa.iso.tasklist.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import ru.mcc.rsa.iso.tasklist.domain.task.Status;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnCreate;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnUpdate;

import java.time.LocalDateTime;

@Data
public class TaskDTO {

    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @Length(max = 255, message = "Title length must by smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    @NotNull(message = "Title must by not null", groups = {OnUpdate.class, OnCreate.class})
    private String title;

    @Length(max = 255, message = "Description length must by smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String description;

    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime expirationDate;
}
