package me.deiner.springboot.services;

import me.deiner.springboot.models.User;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface UserService {


    List<User> findAll();

    User findOne(int id);

    @Transactional
    void savePerson(User user);

    @Transactional
    void updatePerson(int id, User updateduser);

    @Transactional
    void deletePerson(int id);
}
