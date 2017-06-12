package ticketsapp.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.account.EventService;
import ticketsapp.domain.Event;
import ticketsapp.repository.EventRepository;
import ticketsapp.repository.dao.EventHbntDAO;
import ticketsapp.repository.dao.TempDatabase;
import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService {
    public EventServiceImpl() {
    }

    private EventRepository eventRepository;
    private TempDatabase tempDatabase;
    private EventHbntDAO eventHbntDAO;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, TempDatabase tempDatabase, EventHbntDAO eventHbntDAO) {
        this.eventRepository = eventRepository;
        this.tempDatabase = tempDatabase;
        this.eventHbntDAO = eventHbntDAO;
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
        return eventHbntDAO.getEventById(id);
    }

}
