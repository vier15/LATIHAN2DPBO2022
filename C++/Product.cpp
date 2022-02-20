class Product{

    /* Private Attribute */
    private:

        string price;
        string idProduct;

    /* Public Attribute and Method */
    public:

        /* Constructor */
        Product() {
            this->price = "Price";
            this->idProduct = "Id Product";
        }

        /* Setter dan Getter Price */
        void setPrice(string price) {
            this->price = price;
        }

        string getPrice() {
            return this->price;
        }

        /* Setter dan Getter Id Product */
        void setIdProduct(string idProduct) {
            this->idProduct = idProduct;
        }

        string getIdProduct() {
            return this->idProduct;
        }

        /* Destructor */
        ~Product() {

        }

};
