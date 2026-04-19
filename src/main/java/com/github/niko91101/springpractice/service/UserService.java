package com.github.niko91101.springpractice.service;

import com.github.niko91101.springpractice.model.User;
import com.github.niko91101.springpractice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.allUsers();
    }

    public User getUserById(int id) {
        return userRepository.getUser(id);
    }

    public String addUser(User user) {
        if (user != null) {
            userRepository.addUser(user);
            return "Пользователь добавлен";
        }

        throw new IllegalArgumentException("Не удалось добавить пользователя");
    }
}
