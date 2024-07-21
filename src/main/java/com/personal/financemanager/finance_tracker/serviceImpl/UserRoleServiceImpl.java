package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.UserRoleDTO;
import com.personal.financemanager.finance_tracker.model.User;
import com.personal.financemanager.finance_tracker.repository.UserRepository;
import com.personal.financemanager.finance_tracker.service.UserRoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {

    UserRepository userRepository;
    @Override
    public UserRoleDTO createUserRole(UserRoleDTO userRoleDTO) {

        return null;
    }

    @Override
    public UserRoleDTO updateUserRole(Long userRoleId, UserRoleDTO userRoleDTO) {
        return null;
    }

    @Override
    public void deleteUserRole(Long userRoleId) {

    }

    @Override
    public Optional<UserRoleDTO> getUserRoleById(Long userRoleId) {
        return Optional.empty();
    }

    @Override
    public List<UserRoleDTO> getUserRolesByUserId(Long userId) {
        return null;
    }

    @Override
    public List<UserRoleDTO> getUserRolesByRoleId(Long roleId) {
        return null;
    }
}
