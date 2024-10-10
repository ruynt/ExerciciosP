class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")

    def acelerar(self, incremento):
        self.velocidade += incremento
        print(f"O carro acelerou. Velocidade atual: {self.velocidade} km/h")

    def frear(self, decremento):
        if self.velocidade - decremento >= 0:
            self.velocidade -= decremento
        else:
            self.velocidade = 0
        print(f"O carro freou. Velocidade atual: {self.velocidade} km/h")

    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")


carro = Carro("Toyota", "Corolla", 2020)


carro.exibir_detalhes()


carro.acelerar(20)
carro.acelerar(30)


carro.exibir_velocidade()


carro.frear(10)
carro.frear(50)


carro.exibir_velocidade()
