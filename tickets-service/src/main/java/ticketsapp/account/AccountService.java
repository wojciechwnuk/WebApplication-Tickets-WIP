package ticketsapp.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.domain.Account;
import ticketsapp.repository.AccountRepository;

@Transactional

public interface AccountService {
     Long create(Account account);
}
