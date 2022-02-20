class Memory: public Hardware{

    /* Private Attribute */
    private:

        string frequency;
        string memorySize;
        string supportsCuda;

    /* Public Attribute and Method */
    public:

        /* Constructor */
        Memory() {
            this->frequency = "Frequency";
            this->memorySize = "Memory Size";
            this->supportsCuda = "Supports Cuda";
        }

        /* Setter dan Getter Frequency */
        void setFrequency(string frequency) {
            this->frequency = frequency;
        }

        string getFrequency() {
            return this->frequency;
        }

        /* Setter dan Getter Memory Size */
        void setMemorySize(string memorySize) {
            this->memorySize = memorySize;
        }

        string getMemorySize() {
            return this->memorySize;
        }

        /* Setter dan Getter Supports Cuda */
        void setSupportsCuda(string supportsCuda) {
            this->supportsCuda = supportsCuda;
        }

        string getSupportsCuda() {
            return this->supportsCuda;
        }

        /* Method untuk menampilkan data Memory */
        void showMemoryData() {
            cout << "\n__/Product Data___________________";
            cout << "\nPrice : " << this->getPrice();
            cout << "\nId Product : " << this->getIdProduct();
            cout << "\n__________________________________";
            cout << "\n ";
            cout << "\n__/Hardware Data___________________";
            cout << "\nBrand : " << this->getBrand();
            cout << "\nModel : " << this->getModel();
            cout << "\n__________________________________";
            cout << "\n ";
            cout << "\n__/Memory Data___________________";
            cout << "\nFrequency : " << this->getFrequency();
            cout << "\nMemory Size : " << this->getMemorySize();
            cout << "\nSupports Cuda : " << this->getSupportsCuda();
            cout << "\n__________________________________";
            cout << "\n ";
        }

        /* Destructor */
        ~Memory() {

        }

};
