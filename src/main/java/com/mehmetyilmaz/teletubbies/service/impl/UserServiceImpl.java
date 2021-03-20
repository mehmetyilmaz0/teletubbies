package com.mehmetyilmaz.teletubbies.service.impl;

import com.mehmetyilmaz.teletubbies.entity.User;
import com.mehmetyilmaz.teletubbies.repository.UserRepository;
import com.mehmetyilmaz.teletubbies.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPagination(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
