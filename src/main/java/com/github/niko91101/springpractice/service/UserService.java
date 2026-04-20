package com.github.niko91101.springpractice.service;

import com.github.niko91101.springpractice.exception.UserNotFoundExeption;
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
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundExeption(id));
    }

    public String addUser(User user) {
        if (user != null) {
            userRepository.save(user);
            return "Пользователь добавлен";
        }

        throw new IllegalArgumentException("Не удалось добавить пользователя");
    }
}
