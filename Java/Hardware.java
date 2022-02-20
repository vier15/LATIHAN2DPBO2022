public class Hardware extends Product {

    /* Private Attribute */
    private String brand;
    private String model;

    /* Constuctor */
    public Hardware(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Hardware() {

    }

    /* Setter dan Getter Price */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    /* Setter dan Getter Id Product */
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}