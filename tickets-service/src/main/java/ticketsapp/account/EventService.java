package ticketsapp.account;


import ticketsapp.domain.Event;

import java.util.List;

public interface EventService {
    Long create(Event event);
    List<Event> findAllEvents();
}
