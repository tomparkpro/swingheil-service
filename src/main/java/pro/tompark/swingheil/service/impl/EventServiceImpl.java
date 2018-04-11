package pro.tompark.swingheil.service.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pro.tompark.swingheil.model.Event;
import pro.tompark.swingheil.model.QEvent;
import pro.tompark.swingheil.repository.EventRepository;
import pro.tompark.swingheil.service.EventService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@Service
@Transactional
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEvent(Long eventSn) {
        return eventRepository.getOne(eventSn);
    }

    @Override
    public List<Event> getEvents() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

        QEvent qEvent = QEvent.event;
        return queryFactory.selectFrom(qEvent).fetch();
    }


}
