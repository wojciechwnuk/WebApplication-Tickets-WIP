package ticketsapp.repository.dao;

import org.springframework.stereotype.Repository;
import ticketsapp.domain.Event;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TempDatabase {
     private List<Event> listOfEvent = new ArrayList<>();

    public TempDatabase() {
        Event event1 = new Event(1L,"29.12.2017","Event1", 29L, 1000L);
        Event event2 = new Event(2L,"21.11.2017","Event1", 29L, 1000L);
        listOfEvent.add(event1);
        listOfEvent.add(event2);
    }

    public Event getEventById(Long eventId) {
        Event productById = null;
        for (Event event : listOfEvent) {
            if (event != null && event.getId() != null && event.getId().equals(eventId)) {
                productById = event;
                break;
            }
        }
        if (productById == null) {
            throw new IllegalArgumentException("Brak eventu o wskazanym id: " + eventId);
        }
        return productById;
    }
}
