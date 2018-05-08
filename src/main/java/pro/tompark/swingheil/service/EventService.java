package pro.tompark.swingheil.service;


import pro.tompark.swingheil.model.Event;

import java.util.List;
import java.util.Optional;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
public interface EventService {

    Event createEvent(Event event);

    Optional<Event> getEvent(Long eventSn);

    List<Event> getEvents();

    Event updateEvent(Event event);

    void deleteEvent(Long eventSn);
}
