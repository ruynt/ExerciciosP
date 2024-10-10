class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            raise ValueError("O número deve ser não negativo.")
        if n == 0 or n == 1:
            return 1
        resultado = 1
        for i in range(2, n + 1):
            resultado *= i
        return resultado

# Exemplo de uso
numero = 5
fatorial_numero = Matematica.fatorial(numero)

print(f"O fatorial de {numero} é: {fatorial_numero}")
