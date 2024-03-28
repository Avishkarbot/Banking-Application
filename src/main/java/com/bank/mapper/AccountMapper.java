package com.bank.mapper;

import com.bank.dto.AccountDto;
import com.bank.entity.Account;

public class AccountMapper
{
//    DTO To Entity
    public static Account mapToAccount(AccountDto accountDto)
    {
        Account account = new Account(accountDto.getId(),
        accountDto.getAccountHolderName(),
        accountDto.getBalance()
        );

        return account;
    }

//    Entity To DTO
    public static AccountDto mapTAccountDto(Account account)
    {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );

        return  accountDto;
    }
}
