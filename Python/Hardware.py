from Product import Product

class Hardware(Product):

    #private attributes
    __brand = "Brand"
    __model = "Model"

    #Constructor
    def __init__(self, brand = "Brand", model = "Model"):
        self.__brand = brand
        self.__model = model
    
    #Setter dan Getter Brand
    def setBrand(self, brand):
        self.__brand = brand

    def getBrand(self):
        return self.__brand

    #Setter dan Getter Model
    def setModel(self, model):
        self.__model = model

    def getModel(self):
        return self.__model