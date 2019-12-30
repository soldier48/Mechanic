package ModelClass;

/**
 * Created by Wolf Soft on 9/7/2017.
 */

public class BeanClassForTrips {

    String from;
    String destination;


    public BeanClassForTrips(String from, String destination) {
        this.from = from;
        this.destination = destination;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
