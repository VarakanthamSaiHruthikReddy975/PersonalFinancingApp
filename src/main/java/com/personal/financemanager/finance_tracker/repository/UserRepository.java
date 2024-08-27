package com.personal.financemanager.finance_tracker.repository;

import com.personal.financemanager.finance_tracker.dto.UserDTO;
import com.personal.financemanager.finance_tracker.model.ApplicationUser;
import com.personal.financemanager.finance_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.channels.FileChannel;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
