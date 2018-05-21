package pro.tompark.swingheil.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import pro.tompark.swingheil.code.EventType;
import pro.tompark.swingheil.model.Event;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class EventServiceTest {

    @Autowired
    private Environment env;

    @Autowired
    private EventService eventService;

    @Before
    public void init() {
        System.err.println("SWINGHEIL_DB_USERNAME: " + env.getProperty("SWINGHEIL_DB_USERNAME"));
        System.err.println("SWINGHEIL_DB_PASSWORD: " + env.getProperty("SWINGHEIL_DB_PASSWORD"));
    }

    @Test
    public void testCreateEvent() {
        Event event = new Event();
        event.setTitle("Event Title");
        event.setEventType(EventType.Notice);
        Event createdEvent = eventService.createEvent(event);

        assertNotNull(createdEvent);
        System.err.println(createdEvent);
    }

    @Test
    public void testGetEvent() {
        Event event = new Event();
        event.setTitle("Event Title");
        Event created = eventService.createEvent(event);

        Optional<Event> selectedEvent = eventService.getEvent(created.getEventSn());

        assertNotNull(selectedEvent);
        System.err.println(selectedEvent.map(Event::getTitle));
    }

    @Test
    public void testGetEvents() {
        Event event = new Event();
        event.setTitle("Event Title1");
        eventService.createEvent(event);
        Event event2 = new Event();
        event2.setTitle("Event Title2");
        eventService.createEvent(event2);

        List<Event> selectedEventList = eventService.getEvents();

        assertNotNull(selectedEventList);

        for (Event selectedEvent : selectedEventList) {
            System.err.println(selectedEvent);
        }
    }

    @Test
    public void testUpdateEvent() {
        Event event = new Event();
        event.setTitle("Event Title1");
        event.setEventType(EventType.Notice);
        Event createdEvent = eventService.createEvent(event);


        createdEvent.setEventType(EventType.Lesson);
        Event updatedEvent = eventService.updateEvent(createdEvent);


        Optional<Event> selectedEvent = eventService.getEvent(updatedEvent.getEventSn());
        assertEquals(EventType.Lesson, selectedEvent.map(Event::getEventType).get());
        System.err.println(selectedEvent.map(Event::getEventType));
    }

    @Test
    public void testDeleteEvent() {
        Event event = new Event();
        event.setTitle("Event Title1");
        event.setEventType(EventType.Notice);
        Event createdEvent = eventService.createEvent(event);

        eventService.deleteEvent(createdEvent.getEventSn());


        Optional<Event> selectedEvent = eventService.getEvent(createdEvent.getEventSn());
        assertEquals(Optional.empty(), selectedEvent);
    }
}
