package com.yss.service;

import com.yss.entity.User;
import com.yss.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> Users = new ArrayList<>();
        userRepository.findAll().forEach(Users::add);
        return Users;
    }

    public void addUser(User User) {
        userRepository.save(User);
    }
}