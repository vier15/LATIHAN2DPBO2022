public class Product {

    /* Private Attribute */
    private String price;
    private String idProduct;

    /* Constuctor */
    public Product(String price, String idProduct) {
        this.price = price;
        this.idProduct = idProduct;
    }

    public Product() {

    }

    /* Setter dan Getter Price */
    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    /* Setter dan Getter Id Product */
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

}