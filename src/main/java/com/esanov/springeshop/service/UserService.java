package com.esanov.springeshop.service;

import com.esanov.springeshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService { // security
    boolean save(UserDTO userDTO);
}
