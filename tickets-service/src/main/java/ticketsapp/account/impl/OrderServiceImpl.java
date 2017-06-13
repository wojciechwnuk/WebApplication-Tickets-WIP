package ticketsapp.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.account.OrderService;
import ticketsapp.domain.Event;
import ticketsapp.repository.EventRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public OrderServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    private EventRepository eventRepository;

    @Override
    public Event getIdOfEvent(Long id) {
        return eventRepository.getOne(id);
    }
}

