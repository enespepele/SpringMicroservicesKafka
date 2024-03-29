package com.enesppl.springbootrestfulwebservices.repository;

import com.enesppl.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
