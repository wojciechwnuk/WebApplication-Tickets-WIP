package ticketsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketsapp.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}