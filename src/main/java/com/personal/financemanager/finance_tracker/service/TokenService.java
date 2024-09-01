package com.personal.financemanager.finance_tracker.service;

import org.springframework.security.core.Authentication;

public interface TokenService {
    public String generateJwt(Authentication auth);
}
