package ru.mcc.rsa.iso.tasklist.service.impl;

import org.springframework.stereotype.Service;
import ru.mcc.rsa.iso.tasklist.domain.user.User;
import ru.mcc.rsa.iso.tasklist.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long userId) {

    }
}
