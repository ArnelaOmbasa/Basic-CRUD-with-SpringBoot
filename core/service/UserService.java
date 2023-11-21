package com.prep.prep.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prep.prep.core.model.User;
import com.prep.prep.core.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {

            return userRepository.findById(id);
        } else {
            throw new RuntimeException("User doesn't exist yo");
        }
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
