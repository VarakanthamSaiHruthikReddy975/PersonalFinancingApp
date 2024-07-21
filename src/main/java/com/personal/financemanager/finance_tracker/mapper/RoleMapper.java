package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.RoleDTO;
import com.personal.financemanager.finance_tracker.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO toDTO(Role role);
    Role toEntity(RoleDTO roleDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDtoRole(RoleDTO roleDTO, @MappingTarget Role role);
}
