package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private int id = 0;
    private List<User> users = new ArrayList<>();

    public List<User> userList() {
        return users;
    }

    public List<User> addUser(User user) {
        if (user != null) {
            user.setId(++id);
            users.add(user);
        }
        return users;
    }

    public List<User> updateUser(User user) {
        if (user != null) {
            if (users.size() == 0 || users.size() < user.getId()) return users;
            users.set(user.getId() - 1, user);
        }
        return users;
    }

    public List<User> delUser(int id) {
        if (users.size() == 0 || users.size() < id) return users;
        users.remove(id);
        return users;
    }


}
