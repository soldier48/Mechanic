package ModelClass;

/**
 * Created by Remmss on 09-09-17.
 */

public class BeanClassForBrokersList {

    String broker_name;
    int profile_image;

    public BeanClassForBrokersList(String broker_name, int profile_image) {
        this.broker_name = broker_name;
        this.profile_image = profile_image;
    }

    public String getBroker_name() {
        return broker_name;
    }

    public void setBroker_name(String broker_name) {
        this.broker_name = broker_name;
    }
}
