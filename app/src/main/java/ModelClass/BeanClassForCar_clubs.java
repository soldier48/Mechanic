package ModelClass;

/**
 * Created by Wolf Soft on 9/6/2017.
 */

public class BeanClassForCar_clubs {


    Integer logo_image;
    String brand_name;
    String members;
    Integer car_image;

    public BeanClassForCar_clubs(Integer logo_image, String brand_name, String members, Integer car_image) {
        this.logo_image = logo_image;
        this.brand_name = brand_name;
        this.members = members;
        this.car_image = car_image;
    }

    public Integer getLogo_image() {
        return logo_image;
    }

    public void setLogo_image(Integer logo_image) {
        this.logo_image = logo_image;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public Integer getCar_image() {
        return car_image;
    }

    public void setCar_image(Integer car_image) {
        this.car_image = car_image;
    }
}
