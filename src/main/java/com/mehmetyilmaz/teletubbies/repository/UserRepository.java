package com.mehmetyilmaz.teletubbies.repository;

import com.mehmetyilmaz.teletubbies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername (String username);

}
