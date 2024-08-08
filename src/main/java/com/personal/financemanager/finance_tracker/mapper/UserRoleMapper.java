package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.UserDTO;
import com.personal.financemanager.finance_tracker.dto.UserRoleDTO;
import com.personal.financemanager.finance_tracker.model.User;
import com.personal.financemanager.finance_tracker.model.UserRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserRoleMapper {

    UserRoleDTO toDTO(UserRole userRole);
    UserRole toEntity(UserRoleDTO userRoleDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDTOUserRole(UserRoleDTO userDTO, @MappingTarget UserRole userRole);
}
