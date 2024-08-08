package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.UserDTO;
import com.personal.financemanager.finance_tracker.mapper.UserMapper;
import com.personal.financemanager.finance_tracker.model.User;
import com.personal.financemanager.finance_tracker.repository.UserRepository;
import com.personal.financemanager.finance_tracker.service.UserService;
import jakarta.transaction.Transactional;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }

    @Override
    @Transactional
    public UserDTO updateUser(Long Id, UserDTO userDTO) {
        Optional<User> userOptional = userRepository.findById(Id);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            userMapper.updateEntityFromDtoUser(userDTO, user);
            user = userRepository.save(user);
            return userMapper.toDTO(user);
        }
        else{
            throw new UsernameNotFoundException("User with id"+ Id+ " Not Found");
        }
    }

    @Override
    public String deleteUser(Long Id) {
        if(userRepository.existsById(Id)){
            userRepository.deleteById(Id);
            return "User deleted successfully.";
        }
        else {
            throw new UsernameNotFoundException("User with id"+ Id+ " Not Found");
        }
    }

    @Override
    @Transactional
    public Optional<UserDTO> getUserById(Long Id) {
        return userRepository.findById(Id)
                .map(userMapper::toDTO);
    }

    @Override

    public Optional<UserDTO> getUserByUsername(String Username) {
        return userRepository.findByUsername(Username)
                .map(userMapper::toDTO);
    }

    @Override
    public Optional<UserDTO> getUserByEmail(String Email) {
        return userRepository.findByEmail(Email)
                .map(userMapper::toDTO);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }
}

