package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.RoleDTO;
import com.personal.financemanager.finance_tracker.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public RoleDTO createRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Long roleId, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {

    }

    @Override
    public Optional<RoleDTO> getRoleById(Long roleId) {
        return Optional.empty();
    }

    @Override
    public Optional<RoleDTO> getRoleByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<RoleDTO> getAllRoles() {
        return null;
    }
}
