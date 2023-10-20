package ru.mcc.rsa.iso.tasklist.web.dto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.domain.user.User;
import ru.mcc.rsa.iso.tasklist.service.TaskService;
import ru.mcc.rsa.iso.tasklist.service.UserService;
import ru.mcc.rsa.iso.tasklist.web.dto.mappers.TaskMapper;
import ru.mcc.rsa.iso.tasklist.web.dto.mappers.UserMapper;
import ru.mcc.rsa.iso.tasklist.web.dto.task.TaskDTO;
import ru.mcc.rsa.iso.tasklist.web.dto.user.UserDTO;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnCreate;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnUpdate;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDTO update(@Validated(OnUpdate.class) @RequestBody UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        User updatedUser = userService.update(user);
        return userMapper.toDTO(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return userMapper.toDTO(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDTO> getTaskByUserId(@PathVariable Long id) {
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDTO(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDTO createTask(@PathVariable Long id,
                              @Validated(OnCreate.class) @RequestBody TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        Task createdTask = taskService.create(task, id);
        return taskMapper.toDTO(createdTask);
    }
}
