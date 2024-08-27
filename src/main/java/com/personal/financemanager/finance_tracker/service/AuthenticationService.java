package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.model.ApplicationUser;

public interface AuthenticationService {

    public ApplicationUser registerUser(String username, String password);

}
