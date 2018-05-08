package pro.tompark.swingheil.model;

import lombok.*;
import pro.tompark.swingheil.code.EventType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@Getter
@Setter
@ToString
@Entity
@Table(name="event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_sn", nullable = false)
    private Long eventSn;

    @Column(name = "title")
    private String title;

    @Column(name = "body_text")
    private String bodyText;

    @Column(name = "start_dt")
    private Date startDt;

    @Column(name = "end_dt")
    private Date endDt;

    @Column(name = "event_type")
    private EventType eventType;
}