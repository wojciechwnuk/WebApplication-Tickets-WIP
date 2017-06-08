package ticketsapp.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ticketsapp.account.AccountService;
import ticketsapp.domain.Account;
import ticketsapp.repository.AccountRepository;


public class AccountServiceImpl implements AccountService {

    @Autowired
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long create(Account account) {
        accountRepository.save(account);

        return account.getId();
    }
}

