package pro.tompark.swingheil.code;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 *
 *  <ul>
 *  <li>Event Type</li>
 *  </ul>
 */
public enum EventType {
    /**
     * <ul>
     * <li>Notice</li>
     * </ul>
     */
    Notice("Notice"),
    /**
     * <ul>
     * <li>Lesson</li>
     * </ul>
     */
    Lesson("Lesson"),
    /**
     * <ul>
     * <li>Social</li>
     * </ul>
     */
    Social("Social"),
    /**
     * <ul>
     * <li>Competition</li>
     * </ul>
     */
    Competition("Competition");

    private String id;

    EventType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
