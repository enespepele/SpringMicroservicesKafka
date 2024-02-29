package com.enesppl.springbootrestfulwebservices.repository;

import com.enesppl.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {


}
