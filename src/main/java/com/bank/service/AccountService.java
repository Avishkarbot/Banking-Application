package com.bank.service;

import com.bank.dto.AccountDto;

import java.util.List;

public interface AccountService
{
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);

    AccountDto deposite(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
