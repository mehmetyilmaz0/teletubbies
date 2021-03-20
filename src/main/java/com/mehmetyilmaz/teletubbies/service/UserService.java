package com.mehmetyilmaz.teletubbies.service;

import com.mehmetyilmaz.teletubbies.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save (User user);

    User getById(Long id);

    Page<User> getAllPagination (Pageable pageable);

}
