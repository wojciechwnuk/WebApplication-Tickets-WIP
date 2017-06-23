package ticketsapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.service.EventService;
import ticketsapp.domain.Event;
import ticketsapp.repository.EventRepository;

import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService {
    public EventServiceImpl() {
    }

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Long create(Event event) {
        eventRepository.save(event);
        return event.getId();
    }

    public void createDefaultEvents() {

            Event defaultEvent1 = new Event(1L, "27.07.2017", "Super Concert of Famous Artist!", 19L, 1000L);
            Event defaultEvent2 = new Event(2L, "27.07.2017", "Concert of Non-Famous Artist!", 12L, 500L);
            Event defaultEvent3 = new Event(3L, "27.07.2017", "Festival of Colours", 2L, 300L);

            eventRepository.save(defaultEvent1);
            eventRepository.save(defaultEvent2);
            eventRepository.save(defaultEvent3);

    }

    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findOne(id);
    }

    public void updateTickets(Long id, Long count) {
        Event event = eventRepository.findOne(id);

        if (event.getAvailableTickets() < count) {
            throw new IllegalArgumentException("Not enough tickets: " + event.getAvailableTickets());
        }
        event.setAvailableTickets(event.getAvailableTickets() - count);
       eventRepository.save(event);

    }

}
