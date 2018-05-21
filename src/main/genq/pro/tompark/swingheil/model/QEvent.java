package pro.tompark.swingheil.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEvent is a Querydsl query type for Event
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = -313959246L;

    public static final QEvent event = new QEvent("event");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath bodyText = createString("bodyText");

    //inherited
    public final DateTimePath<java.util.Date> createdDt = _super.createdDt;

    public final DateTimePath<java.util.Date> endDt = createDateTime("endDt", java.util.Date.class);

    public final NumberPath<Long> eventSn = createNumber("eventSn", Long.class);

    public final EnumPath<pro.tompark.swingheil.code.EventType> eventType = createEnum("eventType", pro.tompark.swingheil.code.EventType.class);

    public final DateTimePath<java.util.Date> startDt = createDateTime("startDt", java.util.Date.class);

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.util.Date> updatedDt = _super.updatedDt;

    public QEvent(String variable) {
        super(Event.class, forVariable(variable));
    }

    public QEvent(Path<? extends Event> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvent(PathMetadata metadata) {
        super(Event.class, metadata);
    }

}

