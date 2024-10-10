class SaldoInsuficienteException(Exception):
    def __init__(self, saldo_atual, valor_saque):
        super().__init__(f"Saque de R${valor_saque} não permitido. Saldo atual: R${saldo_atual}.")
        self.saldo_atual = saldo_atual
        self.valor_saque = valor_saque

class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.titular = titular
        self.saldo = saldo_inicial

    def depositar(self, valor):
        if valor > 0:
            self.saldo += valor
            print(f"Depósito de R${valor} realizado com sucesso!")
        else:
            print("Valor de depósito inválido.")

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(self.saldo, valor)
        self.saldo -= valor
        print(f"Saque de R${valor} realizado com sucesso!")

    def exibir_saldo(self):
        print(f"Saldo atual: R${self.saldo:.2f}")

conta = ContaBancaria("João", 1000)

try:
    conta.exibir_saldo()
    conta.sacar(1500)
except SaldoInsuficienteException as e:
    print(e)

conta.depositar(500)
conta.exibir_saldo()
