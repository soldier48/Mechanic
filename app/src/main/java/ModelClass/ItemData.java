package ModelClass;

/**
 * Created by Wolf Soft on 2/1/2017.
 */

public class ItemData {

    String text;

    public ItemData(String text, Integer imageId) {
        this.text = text;

    }

    public ItemData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


}

