class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outro):
        if isinstance(outro, Produto):
            return Produto(f"{self.nome} & {outro.nome}", self.preco + outro.preco)
        return NotImplemented

    def __str__(self):
        return f"Produto: {self.nome}, Preço: R${self.preco:.2f}"

produto1 = Produto("Produto A", 50.00)
produto2 = Produto("Produto B", 30.00)

produto_soma = produto1 + produto2

print(produto_soma)
