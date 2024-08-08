package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(Long Id, UserDTO userDTO);

    String deleteUser(Long Id);

    Optional<UserDTO> getUserById(Long Id);
    Optional<UserDTO> getUserByUsername(String Username);

    Optional<UserDTO> getUserByEmail(String Email);

    List<UserDTO> getAllUsers();
}
