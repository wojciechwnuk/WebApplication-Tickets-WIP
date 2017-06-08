package ticketsapp.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.account.AccountService;
import ticketsapp.domain.Account;
import ticketsapp.repository.AccountRepository;

@Service
@Transactional

public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long create(Account account) {
        accountRepository.save(account);

        return account.getId();
    }
}

