package ticketsapp.account;


import ticketsapp.domain.Event;

import java.util.List;

public interface EventService {
    Long create(Event event);
    List<Event> findAllEvents();
    Event getEventById(Long id);
     void createDefaultEvents();
     void updateTickets(Long id, Long count);
}
