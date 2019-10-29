package mate.academy.spring.dao;

import java.util.List;

import mate.academy.spring.entity.User;

public interface UserDao {

    void add(User user);

    User getUser(Long id);

    List<User> listUsers();

    User findByLogin(String login);
}
