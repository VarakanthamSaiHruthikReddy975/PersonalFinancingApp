package com.personal.financemanager.finance_tracker.controller;

import com.personal.financemanager.finance_tracker.dto.LoginResponseDTO;
import com.personal.financemanager.finance_tracker.dto.RegistrationDTO;
import com.personal.financemanager.finance_tracker.model.ApplicationUser;
import com.personal.financemanager.finance_tracker.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO registrationDTO){
        return authenticationService.registerUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body) {
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }

}