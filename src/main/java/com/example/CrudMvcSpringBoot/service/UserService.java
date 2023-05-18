package com.example.CrudMvcSpringBoot.service;


import com.example.CrudMvcSpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();

    User showUser (int id);

    void createUser(User user);

    void updateUser(User user, int id);

    void deleteUser(int id);
}
