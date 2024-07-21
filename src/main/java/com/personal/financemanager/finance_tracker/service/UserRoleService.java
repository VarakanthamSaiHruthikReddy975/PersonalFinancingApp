package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.UserRoleDTO;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    UserRoleDTO createUserRole(UserRoleDTO userRoleDTO);
    UserRoleDTO updateUserRole(Long userRoleId, UserRoleDTO userRoleDTO);
    void deleteUserRole(Long userRoleId);
    Optional<UserRoleDTO> getUserRoleById(Long userRoleId);
    List<UserRoleDTO> getUserRolesByUserId(Long userId);
    List<UserRoleDTO> getUserRolesByRoleId(Long roleId);
}
