package ru.home.des.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.des.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByLogin(String login);
    void deleteUserById(Long id);
}
