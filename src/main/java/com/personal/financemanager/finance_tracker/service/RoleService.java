package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.RoleDTO;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    RoleDTO createRole(RoleDTO roleDTO);
    RoleDTO updateRole(Long roleId, RoleDTO roleDTO);
    void deleteRole(Long roleId);
    Optional<RoleDTO> getRoleById(Long roleId);
    Optional<RoleDTO> getRoleByName(String name);
    List<RoleDTO> getAllRoles();
}
