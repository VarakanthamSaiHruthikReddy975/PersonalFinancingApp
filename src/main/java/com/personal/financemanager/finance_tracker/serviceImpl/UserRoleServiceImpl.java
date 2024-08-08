package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.UserRoleDTO;
import com.personal.financemanager.finance_tracker.mapper.UserRoleMapper;
import com.personal.financemanager.finance_tracker.model.UserRole;
import com.personal.financemanager.finance_tracker.repository.UserRoleRepository;
import com.personal.financemanager.finance_tracker.service.UserRoleService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {

    UserRoleRepository userRoleRepository;
    UserRoleMapper userRoleMapper;
    @Override
    public UserRoleDTO createUserRole(UserRoleDTO userRoleDTO) {
        UserRole userRole = userRoleMapper.toEntity(userRoleDTO);
        userRole = userRoleRepository.save(userRole);

        return userRoleMapper.toDTO(userRole);
    }

    @Override
    public UserRoleDTO updateUserRole(Long userRoleId, UserRoleDTO userRoleDTO) {
        Optional<UserRole> userRoleOptional = userRoleRepository.findById(userRoleId);
        if(userRoleOptional.isPresent()){
            UserRole userRole = userRoleOptional.get();
            userRoleMapper.updateEntityFromDTOUserRole(userRoleDTO, userRole);
            userRole = userRoleRepository.save(userRole);
            return userRoleMapper.toDTO(userRole);
        }
        else{
            throw new UsernameNotFoundException("User with id"+ userRoleId+ " Not Found");
        }
    }

    @Override
    public void deleteUserRole(Long userRoleId) {
        if(userRoleRepository.existsById(userRoleId)){
            userRoleRepository.deleteById(userRoleId);
        }
        else{
            throw new UsernameNotFoundException("User with id"+userRoleId+" Not found");
        }
    }

    @Override
    @Transactional
    public Optional<UserRoleDTO> getUserRoleById(Long userRoleId) {
        return userRoleRepository
                .findById(userRoleId)
                .map(userRoleMapper::toDTO);
    }

    @Override
    public Optional<List<UserRoleDTO>> getUserRolesByUserId(Long userId) {
        Optional<UserRole> userRoles = userRoleRepository.findByUserId(userId);
        List<UserRoleDTO> userRoleDTOS = userRoles.stream()
                .map(userRoleMapper::toDTO) // Convert UserRole to UserRoleDTO
                .collect(Collectors.toList());

        return userRoleDTOS.isEmpty() ? Optional.empty() : Optional.of(userRoleDTOS);
    }


    @Override
    public List<UserRoleDTO> getUserRolesByRoleId(Long roleId) {
        return null;
    }
}
