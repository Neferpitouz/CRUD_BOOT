package me.deiner.springboot.dao;



import me.deiner.springboot.models.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    User getById(int id);

    List<User> getAll();

    void update(User user);

    void delete(int id);
}
