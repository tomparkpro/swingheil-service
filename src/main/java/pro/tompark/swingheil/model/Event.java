package pro.tompark.swingheil.model;

import pro.tompark.swingheil.code.EventType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@Entity
@Table(name="event")
public class Event extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_sn", nullable = false)
    private Long eventSn;

    @Column(name = "title", length = 300)
    private String title;

    @Column(name = "body_text", length = 3000)
    private String bodyText;

    @Column(name = "start_dt")
    private Date startDt;

    @Column(name = "end_dt")
    private Date endDt;

    @Column(name = "event_type")
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    public Long getEventSn() {
        return eventSn;
    }

    public void setEventSn(Long eventSn) {
        this.eventSn = eventSn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    public Date getEndDt() {
        return endDt;
    }

    public void setEndDt(Date endDt) {
        this.endDt = endDt;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
