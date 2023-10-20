package ru.mcc.rsa.iso.tasklist.repository;

import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.domain.user.Role;
import ru.mcc.rsa.iso.tasklist.domain.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(User user, Role role);

    boolean isTaskOwner(Long userId, Task taskId);

    void delete(Long id);
}
