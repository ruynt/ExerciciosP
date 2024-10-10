class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.titular = titular
        self.__saldo = saldo_inicial

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor} realizado com sucesso!")
        else:
            print("Valor de depósito inválido.")

    def sacar(self, valor):
        if valor > 0 and valor <= self.__saldo:
            self.__saldo -= valor
            print(f"Saque de R${valor} realizado com sucesso!")
        else:
            print("Saldo insuficiente ou valor de saque inválido.")

    def exibir_saldo(self):
        print(f"Saldo atual: R${self.__saldo}")


conta = ContaBancaria("João", 1000)


conta.exibir_saldo()


conta.depositar(500)


conta.exibir_saldo()


conta.sacar(300)


conta.exibir_saldo()


conta.sacar(1500)


conta.exibir_saldo()
