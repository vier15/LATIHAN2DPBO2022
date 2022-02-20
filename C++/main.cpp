#include <iostream>
#include <string>

using namespace std;

#include "Product.cpp"
#include "Hardware.cpp"
#include "Memory.cpp"

int main() {

    /* Variabel penampu input */
    string inputFrequency;
    string inputMemorySize;
    string inputSupportsCuda;
    string inputPrice;
    string inputIdProduct;
    string inputBrand;
    string inputModel;

    /* Inputting */
    cout << "Input Frequency... ";
    cin >> inputFrequency;

    cout << "Input Memory Size... ";
    cin >> inputMemorySize;

    cout << "Input Supports Cuda... ";
    cin >> inputSupportsCuda;

    cout << "Input Price... ";
    cin >> inputPrice;

    cout << "Input Id Product... ";
    cin >> inputIdProduct;

    cout << "Input Brand... ";
    cin >> inputBrand;

    cout << "Input Model... ";
    cin >> inputModel;

    /* Deklarasi objek Player dengan nama memory1 beserta inisialisasinya berdasarkan input */
    Memory memory1;
    memory1.setFrequency(inputFrequency);
    memory1.setMemorySize(inputMemorySize);
    memory1.setSupportsCuda(inputSupportsCuda);
    memory1.setPrice(inputPrice);
    memory1.setIdProduct(inputIdProduct);
    memory1.setBrand(inputBrand);
    memory1.setModel(inputModel);

    /* Menampilkan data memory1 */
    memory1.showMemoryData();

    return 0;
}

