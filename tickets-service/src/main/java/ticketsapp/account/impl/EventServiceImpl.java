package ticketsapp.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.account.EventService;
import ticketsapp.domain.Event;
import ticketsapp.repository.EventRepository;
import ticketsapp.repository.dao.TempDatabase;

import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService {
    public EventServiceImpl() {
    }

    private  EventRepository eventRepository;
    private TempDatabase tempDatabase;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, TempDatabase tempDatabase) {
        this.eventRepository = eventRepository;
        this.tempDatabase = tempDatabase;
    }

    public Long create(Event event) {
        eventRepository.save(event);
        return event.getId();
    }

    public List<Event> findAllEvents() {
        List<Event> listOfEvents = eventRepository.findAll();

        return listOfEvents;
    }

    public Event getEventById(Long id) {
        return tempDatabase.getEventById(id);
    }

}
