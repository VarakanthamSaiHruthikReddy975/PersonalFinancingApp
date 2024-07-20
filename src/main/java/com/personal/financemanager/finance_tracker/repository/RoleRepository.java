package com.personal.financemanager.finance_tracker.repository;

import com.personal.financemanager.finance_tracker.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
