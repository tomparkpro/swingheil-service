package pro.tompark.swingheil.service.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pro.tompark.swingheil.model.Event;
import pro.tompark.swingheil.model.QEvent;
import pro.tompark.swingheil.repository.EventRepository;
import pro.tompark.swingheil.service.EventService;

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

    private final EventRepository eventRepository;

    private final JPAQueryFactory queryFactory;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, JPAQueryFactory queryFactory) {
        this.eventRepository = eventRepository;
        this.queryFactory = queryFactory;
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEvent(Long eventSn) {
        return eventRepository.findOne(eventSn);
    }

    @Override
    public List<Event> getEvents() {
        QEvent qEvent = QEvent.event;
        return queryFactory.selectFrom(qEvent).fetch();
    }

    @Override
    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Long eventSn) {
        eventRepository.delete(eventSn);
    }

}
