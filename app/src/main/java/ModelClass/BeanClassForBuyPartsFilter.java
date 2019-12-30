package ModelClass;

/**
 * Created by Wolf Soft on 9/11/2017.
 */

public class BeanClassForBuyPartsFilter {

    int image;
    String name;
    String subtitle;
    String discount_price;
    String price;
    String discount;

    public BeanClassForBuyPartsFilter(int image, String name, String subtitle, String discount_price, String price, String discount) {
        this.image = image;
        this.name = name;
        this.subtitle = subtitle;
        this.discount_price = discount_price;
        this.price = price;
        this.discount = discount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(String discount_price) {
        this.discount_price = discount_price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
