package com.personal.financemanager.finance_tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDTO {
    private Long id;
    private UserDTO user;
    private RoleDTO role;
}
