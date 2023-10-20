package ru.mcc.rsa.iso.tasklist.web.dto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.service.TaskService;
import ru.mcc.rsa.iso.tasklist.web.dto.mappers.TaskMapper;
import ru.mcc.rsa.iso.tasklist.web.dto.task.TaskDTO;
import ru.mcc.rsa.iso.tasklist.web.dto.validation.OnUpdate;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;

    private final TaskMapper taskMapper;

    @PutMapping
    public TaskDTO update(@Validated(OnUpdate.class) @RequestBody TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        Task updatedTask = taskService.update(task);
        return taskMapper.toDTO(updatedTask);
    }

    @GetMapping("/{id}")
    public TaskDTO getById(@PathVariable Long id) {
        Task task = taskService.getById(id);
        return taskMapper.toDTO(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }
}
