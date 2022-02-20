from Memory import Memory

#input masukan user untuk data Memory
inputFrequency = str(input("Input Frequency..."))
inputMemorySize = str(input("Input Memory Size..."))
inputSupportsCuda = str(input("Input Supports Cuda..."))
inputPrice = str(input("Input Price..."))
inputIdProduct = str(input("Input Id Product..."))
inputBrand = str(input("Input Brand..."))
inputModel = str(input("Input Model..."))

print(" ")

#Pembuatan objek Memory serta
#pengisian data dengan menggunakan method set dalam objek
memory1 = Memory()
memory1.setFrequency(inputFrequency)
memory1.setMemorySize(inputMemorySize)
memory1.setSupportsCuda(inputSupportsCuda)
memory1.setPrice(inputPrice)
memory1.setIdProduct(inputIdProduct)
memory1.setBrand(inputBrand)
memory1.setModel(inputModel)

#Menampilkan data Memory
memory1.showMemoryData()