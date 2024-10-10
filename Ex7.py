class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def adicionar_escola(self, escola):
        if escola not in self.escolas:
            self.escolas.append(escola)
            escola.adicionar_professor(self)

    def exibir_escolas(self):
        escolas_nomes = [escola.nome for escola in self.escolas]
        return f"Professor {self.nome} leciona em: {', '.join(escolas_nomes)}"

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)
            professor.adicionar_escola(self)

    def exibir_professores(self):
        professores_nomes = [professor.nome for professor in self.professores]
        return f"Escola {self.nome} tem os professores: {', '.join(professores_nomes)}"

escola1 = Escola("Escola A")
escola2 = Escola("Escola B")

professor1 = Professor("Carlos")
professor2 = Professor("Ana")

professor1.adicionar_escola(escola1)
professor1.adicionar_escola(escola2)
professor2.adicionar_escola(escola2)

print(escola1.exibir_professores())
print(escola2.exibir_professores())
print(professor1.exibir_escolas())
print(professor2.exibir_escolas())
