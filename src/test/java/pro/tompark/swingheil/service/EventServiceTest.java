package pro.tompark.swingheil.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pro.tompark.swingheil.code.EventType;
import pro.tompark.swingheil.config.SwingheilTestConfig;
import pro.tompark.swingheil.model.Event;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {SwingheilTestConfig.class})
public class EventServiceTest {

    @Autowired
    private EventService eventService;

    @PersistenceContext
    private EntityManager em;

    @Test
    public void testCreateEvent() {
        Event event = new Event();
        event.setTitle("Event Title");
        Event createdEvent = eventService.createEvent(event);

        em.flush();

        assertNotNull(createdEvent);
        System.err.println(createdEvent.getTitle());
    }

    @Test
    public void testGetEvent() {
        Event event = new Event();
        event.setTitle("Event Title");
        Event created = eventService.createEvent(event);

        em.flush();
        em.clear();

        Event selectedEvent = eventService.getEvent(created.getEventSn());

        assertNotNull(selectedEvent);
        System.err.println(selectedEvent.getTitle());
    }

    @Test
    public void testGetEvents() {
        Event event = new Event();
        event.setTitle("Event Title1");
        eventService.createEvent(event);
        Event event2 = new Event();
        event2.setTitle("Event Title2");
        eventService.createEvent(event2);

        em.flush();
        em.clear();

        List<Event> selectedEventList = eventService.getEvents();

        assertNotNull(selectedEventList);

        for (Event selectedEvent : selectedEventList) {
            System.err.println(selectedEvent.getTitle());
        }
    }

    @Test
    public void testUpdateEvent() {
        Event event = new Event();
        event.setTitle("Event Title1");
        event.setEventType(EventType.Notice);
        Event createdEvent = eventService.createEvent(event);

        em.flush();
        em.clear();

        createdEvent.setEventType(EventType.Lesson);
        Event updatedEvent = eventService.updateEvent(createdEvent);

        em.flush();
        em.clear();

        Event selectedEvent = eventService.getEvent(updatedEvent.getEventSn());
        assertEquals(EventType.Lesson, selectedEvent.getEventType());
        System.err.println(selectedEvent.getEventType());
    }

    @Test
    public void testDeleteEvent() {
        Event event = new Event();
        event.setTitle("Event Title1");
        event.setEventType(EventType.Notice);
        Event createdEvent = eventService.createEvent(event);

        eventService.deleteEvent(createdEvent.getEventSn());

        em.flush();
        em.clear();

        Event selectedEvent = eventService.getEvent(createdEvent.getEventSn());
        assertNull(selectedEvent);
    }
}
