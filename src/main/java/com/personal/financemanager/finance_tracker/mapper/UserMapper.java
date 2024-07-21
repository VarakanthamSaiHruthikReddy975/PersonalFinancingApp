package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.UserDTO;
import com.personal.financemanager.finance_tracker.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDtoUser(UserDTO userDTO, @MappingTarget User user);
}
