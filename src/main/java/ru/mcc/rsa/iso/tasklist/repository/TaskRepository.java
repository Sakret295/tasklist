package ru.mcc.rsa.iso.tasklist.repository;

import org.springframework.stereotype.Repository;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.domain.user.User;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findAllByUserId(Long user_id);

    void assignToUserById(User userId);

    void update(Task task);

    void create(Task task);

    void delete(Long taskId);
}
