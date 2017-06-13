package ticketsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ticketsapp.domain.Event;

@Repository
public interface EventRepository extends JpaRepository <Event, Long> {

}
