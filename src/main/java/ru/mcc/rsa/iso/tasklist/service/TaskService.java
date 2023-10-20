package ru.mcc.rsa.iso.tasklist.service;

import ru.mcc.rsa.iso.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task update(Task task);

    Task create(Task task, Long id);

    void delete(Long taskId);

}
