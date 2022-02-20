class Hardware: public Product{

    /* Private Attribute */
    private:

        string brand;
        string model;

    /* Public Attribute and Method */
    public:

        /* Constructor */
        Hardware() {
            this->brand = "Brand";
            this->model = "Model";
        }

        /* Setter dan Getter Brand */
        void setBrand(string brand) {
            this->brand = brand;
        }

        string getBrand() {
            return this->brand;
        }

        /* Setter dan Getter Model */
        void setModel(string model) {
            this->model = model;
        }

        string getModel() {
            return this->model;
        }

        /* Destructor */
        ~Hardware() {

        }

};
