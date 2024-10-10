from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcularSalario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas_trabalhadas, valor_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcularSalario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario_mensal):
        self.salario_mensal = salario_mensal

    def calcularSalario(self):
        return self.salario_mensal

horista = FuncionarioHorista(40, 15)
assalariado = FuncionarioAssalariado(3000)

print(f"Salário do funcionário horista: R${horista.calcularSalario()}")
print(f"Salário do funcionário assalariado: R${assalariado.calcularSalario()}")
