package com.dio.service.impl;

import com.dio.domain.model.User;
import com.dio.domain.repository.UserRepository;
import com.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByGameAccountUsername(userToCreate.getGameAccount().getUsername())) {
            throw new IllegalArgumentException("This username already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
