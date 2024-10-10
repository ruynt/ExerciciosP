class Motor:
    def __init__(self, cilindradas):
        self.cilindradas = cilindradas

    def exibir_detalhes(self):
        return f"Motor com {self.cilindradas} cilindradas"

class Carro:
    def __init__(self, marca, modelo, ano, motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = motor

    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")
        print(self.motor.exibir_detalhes())

motor = Motor(2000)
carro = Carro("Toyota", "Corolla", 2020, motor)

carro.exibir_detalhes()
