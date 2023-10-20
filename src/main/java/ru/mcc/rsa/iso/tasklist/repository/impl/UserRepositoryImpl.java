package ru.mcc.rsa.iso.tasklist.repository.impl;

import org.springframework.stereotype.Repository;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.domain.user.Role;
import ru.mcc.rsa.iso.tasklist.domain.user.User;
import ru.mcc.rsa.iso.tasklist.repository.UserRepository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(User user, Role role) {

    }

    @Override
    public boolean isTaskOwner(Long userId, Task taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
