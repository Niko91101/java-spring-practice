package com.github.niko91101.springpractice.repository;

import com.github.niko91101.springpractice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    public List<User> allUsers() {
        return users;
    }

    public User getUser(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Пользователь не найден"));
    }

    public void addUser(User user) {
        users.add(user);
    }
}
