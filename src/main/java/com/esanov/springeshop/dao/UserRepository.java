package com.esanov.springeshop.dao;

import com.esanov.springeshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.name = ?1")
    User findByName(String name);
}
