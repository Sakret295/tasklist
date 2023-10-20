package ru.mcc.rsa.iso.tasklist.repository.impl;

import org.springframework.stereotype.Repository;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.domain.user.User;
import ru.mcc.rsa.iso.tasklist.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long user_id) {
        return null;
    }

    @Override
    public void assignToUserById(User userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long taskId) {

    }
}
