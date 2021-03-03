package ru.home.des.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.home.des.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAll();
    void save(User user);
    User findUserById(Long id);
    void deleteUserById(Long id);
    void deleteUser(User user);
}
