package pro.tompark.swingheil.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pro.tompark.swingheil.config.SwingheilTestConfig;
import pro.tompark.swingheil.model.Event;

import java.util.List;

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
    EventService eventService;

    @Test
    public void testCreateEvent() {
        Event event = new Event();
        event.setTitle("Event Title");
        Event saved = eventService.createEvent(event);

        Event selected = eventService.getEvent(saved.getEventSn());

        System.err.println(selected.getTitle());
    }

    @Test
    public void testGetEvents() {
        Event event = new Event();
        event.setTitle("Event Title1");
        eventService.createEvent(event);
        Event event2 = new Event();
        event2.setTitle("Event Title2");
        eventService.createEvent(event2);

        List<Event> selectedEvents = eventService.getEvents();

        System.err.println(selectedEvents);
    }
}
