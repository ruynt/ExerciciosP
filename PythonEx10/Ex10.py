class Calculadora:
    def somar(self, *args):
        return sum(args)

calculadora = Calculadora()

resultado1 = calculadora.somar(2, 3)
resultado2 = calculadora.somar(1, 2, 3)

print(f"Soma de 2 números: {resultado1}")
print(f"Soma de 3 números: {resultado2}")
