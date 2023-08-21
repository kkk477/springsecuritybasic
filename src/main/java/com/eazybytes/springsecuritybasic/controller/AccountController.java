package com.eazybytes.springsecuritybasic.controller;

import com.eazybytes.springsecuritybasic.model.Accounts;
import com.eazybytes.springsecuritybasic.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam int id) {
        return accountRepository.findByCustomerId(id);
    }
}
