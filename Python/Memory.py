from Hardware import Hardware

class Memory(Hardware):

    #private attributs
    __frequency = "Frequency"
    __memorySize = "Memory Size"
    __supportsCuda = "Supports Cuda"

    #Constructor
    def __init__(self, freqeuncy = "Frequency", memorySize = "Memory Size", supportsCuda = "Supports Cuda"):
        self.__frequency = freqeuncy
        self.__memorySize = memorySize
        self.__supportsCuda = supportsCuda

    #Setter dan Getter Frequency
    def setFrequency(self, frequency):
        self.__frequency = frequency

    def getFrequency(self):
        return self.__frequency

    #Setter dan Getter Memory Size
    def setMemorySize(self, memorySize):
        self.__memorySize = memorySize

    def getMemorySize(self):
        return self.__memorySize

    #Setter dan Getter Supports Cuda
    def setSupportsCuda(self, supportsCuda):
        self.__supportsCuda = supportsCuda

    def getSupportsCuda(self):
        return self.__supportsCuda

    #Method untuk menampilkan data Memory
    def showMemoryData(self):
        print("__/Product Data___________________")
        print("Price : " + str(self.getPrice()))
        print("Id Product : " + str(self.getIdProduct()))
        print("__________________________________")
        print(" ")
        print("__/Hardware Data___________________")
        print("Brand : " + str(self.getBrand()))
        print("Model : " + str(self.getModel()))
        print("__________________________________")
        print(" ")
        print("__/Memory Data___________________")
        print("Frequency : " + str(self.getFrequency()))
        print("Memory Size : " + str(self.getMemorySize()))
        print("Supports Cuda : " + str(self.getSupportsCuda()))
        print("__________________________________")
        print(" ")
