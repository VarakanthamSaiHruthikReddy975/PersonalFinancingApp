package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.UserDTO;
import com.personal.financemanager.finance_tracker.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Long Id) {
        return null;
    }

    @Override
    public String deleteUser(Long Id) {
        return null;
    }

    @Override
    public Optional<UserDTO> getUserById(Long Id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> getUserByUsername(String Username) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> getUserByEmail(String Email) {
        return Optional.empty();
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }
}

