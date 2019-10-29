package mate.academy.spring.service;

import java.util.List;

import mate.academy.spring.entity.User;

public interface UserService {

    void add(User user);

    User getUser(Long id);

    User findByLogin(String login);

    List<User> listUsers();
}
