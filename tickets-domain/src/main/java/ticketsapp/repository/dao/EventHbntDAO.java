package ticketsapp.repository.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ticketsapp.domain.Event;

@Repository
public class EventHbntDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public EventHbntDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Event getEventById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Event event = session.get(Event.class, id);

        return event;
    }
}
