package ticketsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketsapp.domain.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
}
