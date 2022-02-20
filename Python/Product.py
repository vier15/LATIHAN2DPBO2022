class Product():

    #private attributes
    __price = "Price"
    __idProduct = "Id Product"

    #Constructor
    def __init__(self, price = "Price", idProduct = "Id Product"):
        self.__price = price
        self.__idProduct = idProduct
    
    #Setter dan Getter Price
    def setPrice(self, price):
        self.__price = price

    def getPrice(self):
        return self.__price

    #Setter dan Getter Id Product
    def setIdProduct(self, idProduct):
        self.__idProduct = idProduct

    def getIdProduct(self):
        return self.__idProduct