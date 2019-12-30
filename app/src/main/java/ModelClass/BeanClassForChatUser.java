package ModelClass;

/**
 * Created by Wolf Soft on 9/6/2017.
 */

public class BeanClassForChatUser {

    Integer image;
    String name;
    String time;

    public BeanClassForChatUser(Integer image, String name, String time) {
        this.image = image;
        this.name = name;
        this.time = time;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
