class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")

# Instanciando três objetos da classe Carro
carro1 = Carro("Toyota", "Corolla", 2020)
carro2 = Carro("Ford", "Mustang", 2021)
carro3 = Carro("Chevrolet", "Camaro", 2022)

# Exibindo os detalhes de cada carro
carro1.exibir_detalhes()
carro2.exibir_detalhes()
carro3.exibir_detalhes()
